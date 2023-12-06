/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.espercroft.schoolmarm;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.espercroft.util.Event;

/**
 *
 * @author fille
 */
public class HttpUserInterface {

    private final Schoolmarm marm;
    private final HttpServer server;

    public HttpUserInterface(Schoolmarm la_marm) throws IOException, URISyntaxException {
        marm = la_marm;
        server = HttpServer.create(new InetSocketAddress(52394), 1);

        //create context handler for each file listed in accessible_resources.txt
        Scanner scn = new Scanner(new File(marm.getClass().getResource("/webinterface/accessible_resources.txt").toURI()));
        while (scn.hasNextLine()){
            String resource = scn.next();
            server.createContext("/"+resource, createHandlerFor(resource, marm));
        }
        server.createContext("/", new RootHandler(marm));

        server.start();
    }

    public static HttpHandler createHandlerFor(String resourcePath, Schoolmarm marm) {
        return new HttpHandlerImpl(resourcePath, marm);
    }

    private static class HttpHandlerImpl implements HttpHandler {

        private final String resourcePath;
        private final Schoolmarm marm;

        public HttpHandlerImpl(String resourcePath, Schoolmarm marm) {
            this.resourcePath = resourcePath;
            this.marm = marm;
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            //Headers headers = exchange.getRequestHeaders();
            //Set<Map.Entry<String, List<String>>> entries = headers.entrySet();
            StringBuilder response = new StringBuilder();
            
            //if this is a POST request, fire an event.
            if (exchange.getRequestMethod().equalsIgnoreCase("post")) {
                List<Object> eventData = new ArrayList<>();
                eventData.add(resourcePath);
                eventData.add(exchange);
                marm.getEventService().fire(new Event(
                        "http_ui.post",
                        HttpUserInterface.class.toString(),
                        eventData
                ));
                return;
            }
            
            //get file
            File file = null;
            try {
                file = new File(marm.getClass().getResource("/webinterface/" + resourcePath).toURI());
                System.out.println(file);
                
                //set response to the contents of file
                Scanner scn = new Scanner(file);
                while (scn.hasNextLine()) {
                    response.append(scn.nextLine());
                }
            } catch (FileNotFoundException | URISyntaxException ex) {
                response.delete(0, response.length());
                response.append("500 Internal Server Error\n\n");
                response.append(ex.toString());
                response.append('\n');
                response.append(Arrays.toString(ex.getStackTrace()));
                //send error response to client
                exchange.sendResponseHeaders(500, response.length());
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(response.toString().getBytes());
                }
                return;
            }

            //send response to client
            exchange.sendResponseHeaders(200, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.toString().getBytes());
            }
        }
    }

}
