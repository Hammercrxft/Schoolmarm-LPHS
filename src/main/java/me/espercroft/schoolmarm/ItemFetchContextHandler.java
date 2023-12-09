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
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me.espercroft.util.EsperUtil;
import me.espercroft.util.Event;

/**
 *
 * @author fille
 */
public class ItemFetchContextHandler implements HttpHandler {

    Schoolmarm marm;
    HttpServer server;

    public ItemFetchContextHandler(Schoolmarm lmarm, HttpServer lserver) {
        marm = lmarm;
        server = lserver;
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        Headers headers = exchange.getRequestHeaders();
        Set<Map.Entry<String, List<String>>> entries = headers.entrySet();
        StringBuilder response = new StringBuilder();

        URI uri = exchange.getRequestURI();
        //Map<String, String> query;
        String query;
        try {
            //query = EsperUtil.parseQueryString(uri.getRawQuery());
            query = uri.getRawQuery();
        } catch (Exception owch) {
            response.delete(0, response.length());
            response.append("500 Internal Server Error\n\n");
            response.append(owch.toString());
            response.append('\n');
            response.append(Arrays.toString(owch.getStackTrace()));
            //send error response to client
            exchange.sendResponseHeaders(500, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.toString().getBytes());
            }
            return;
        }

        if (query == null || query.isEmpty()) {
            response.append("<h1>Error 400</h1> <p>Bad request (Query was expected, got none)</p>");
            exchange.sendResponseHeaders(404, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.toString().getBytes());
            }
            return;
        }
        List<Object> eventData = new ArrayList<>();
        eventData.add(query);
        eventData.add(exchange);
        eventData.add(marm);
        marm.getEventService().fire(new Event(
                "http_ui.fetch",
                this.getClass().toString(),
                eventData
        ));

    }
}
