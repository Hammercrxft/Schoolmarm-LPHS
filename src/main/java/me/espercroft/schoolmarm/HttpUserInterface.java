/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.espercroft.schoolmarm;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
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
        System.out.println(scn);
        while (scn.hasNextLine()) {
            String resource = scn.nextLine();
            if (resource == null || resource.isBlank()){continue;}
            server.createContext("/" + resource, createHandlerFor(resource, marm));
        }
        server.createContext("/", new RootContextHandler(marm));
        server.createContext("/item_fetch", new ItemFetchContextHandler(marm, server));

        server.start();
    }

    public static HttpHandler createHandlerFor(String resourcePath, Schoolmarm marm) {
        return new HttpHandlerImpl(resourcePath, marm);
    }

    public static String listToJson(List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"data\":");
        sb.append("[");
        boolean firstObject = true;
        for (Object o : list) {
            if (firstObject == true) {
                firstObject = false;
            } else {
                sb.append(',');
            }
            sb.append('"');
            sb.append(o.toString());
            sb.append('"');
        }
        sb.append("]");
        sb.append("}");
        return sb.toString();
    }
    public static String listToJson2(List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"data\":");
        sb.append("[");
        boolean firstObject = true;
        for (Object o : list) {
            if (firstObject == true) {
                firstObject = false;
            } else {
                sb.append(',');
            }
            sb.append(o.toString());
        }
        sb.append("]");
        sb.append("}");
        return sb.toString();
    }
    
    public static String getOperatingAddress() {
        return "http://localhost:52394/";
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
            StringBuilder response = new StringBuilder(); //for use with error responses
            InputStream fileStream; //required for transmitting non-text resources

            //if this is a POST request, fire an event.
            if (exchange.getRequestMethod().equalsIgnoreCase("post")) {
                List<Object> eventData = new ArrayList<>();
                eventData.add(resourcePath);
                eventData.add(exchange);
                eventData.add(marm);
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
                fileStream = new FileInputStream(file);
                //System.out.println(file);
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
                os.write(fileStream.readAllBytes());
            }
        } //end of override
    }

}
