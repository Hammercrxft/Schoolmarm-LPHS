/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.espercroft.schoolmarm;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author fille
 */
public class RootContextHandler implements HttpHandler {

    Schoolmarm marm;

    public RootContextHandler(Schoolmarm lmarm) {
        marm = lmarm;
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        Headers headers = exchange.getRequestHeaders();
        Set<Map.Entry<String, List<String>>> entries = headers.entrySet();
        StringBuilder response = new StringBuilder();

        //if root was requested redirect to index.html
        if (exchange.getRequestURI().toString().equals("/")) {
            response.append("<head>\n"
                    + "  <meta http-equiv=\"Refresh\" content=\"0; URL=index.html\" />\n"
                    + "</head>");
            //send response to client
            exchange.sendResponseHeaders(200, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.toString().getBytes());
            }
            return;
        }

        response.append("<h1>Error 404</h1> <p>Could not find the requested page or resource.</p>");
        
        //otherwise send 404
        exchange.sendResponseHeaders(404, response.length());
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(response.toString().getBytes());
        }
    }
}
