/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.espercroft.schoolmarm.eventhandlers;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.espercroft.schoolmarm.Schoolmarm;
import me.espercroft.util.EsperUtil;
import me.espercroft.util.Event;
import me.espercroft.util.EventHandler;

/**
 *
 * @author fille
 */
public class HTMLGuiFetchHandler implements EventHandler {

    @Override
    public String getTriggeringEvent() {
        return "http_ui.fetch";
    }

    @Override
    public Runnable createTask(Event evt) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    Event event = evt;
                    //Map<String, String> query = (Map<String, String>) event.eventData.get(0);
                    String query = (String) event.eventData.get(0);
                    HttpExchange exchange = (HttpExchange) event.eventData.get(1);
                    Schoolmarm marm = (Schoolmarm) event.eventData.get(2);
                    StringBuilder response = new StringBuilder();

                    switch (query) {
                        case "internal_session_data_version":
                            response.append(marm.sessionDataVersion);
                            send(exchange,response);
                            break;
                        case "overview_master_size":
                            response.append(marm.getMasterIndex().size());
                            send(exchange,response);
                            break;
                        default:
                            response.append("<h1>Error 404</h1> <p>Not Found (There was no item matching query.)</p>");
                            exchange.sendResponseHeaders(404, response.length());
                            try (OutputStream os = exchange.getResponseBody()) {
                                os.write(response.toString().getBytes());
                            }
                            break;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(HTMLGuiFetchHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        return task;
    }

    @Override
    public String getHandlerName() {
        return this.getClass().toString();
    }

    private static void send(HttpExchange exchange, CharSequence response) {
        try {
            exchange.sendResponseHeaders(200, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.toString().getBytes());
            }
        }   catch (IOException ex) {
            Logger.getLogger(HTMLGuiFetchHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
