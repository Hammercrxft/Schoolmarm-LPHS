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
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.espercroft.util.EsperUtil;
import me.espercroft.util.Event;
import me.espercroft.util.EventHandler;

/**
 *
 * @author fille
 */
public class HTMLGuiPostRequestHandler implements EventHandler {

    @Override
    public String getTriggeringEvent() {
        return "http_ui.post";
    }

    @Override
    public Runnable createTask(Event evt) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                Event event = evt;
                String context = (String) event.eventData.get(0);
                HttpExchange exchange = (HttpExchange) event.eventData.get(1);
                
                //String postPurpose = exchange.headerEntries
                Map<String, String> postBody = null;
                //StringBuilder requestBody = new StringBuilder();

                //get POST body
                try {
                    postBody = EsperUtil.parseRequestBody(new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8));
                    System.out.println(postBody.get("name"));
                } catch (IOException ex) {
                    Logger.getLogger(HTMLGuiPostRequestHandler.class.getName()).log(Level.SEVERE, null, ex);
                }

                //CODE 204 - OK RESPONSE, NO CONTENT
                try {
                    exchange.sendResponseHeaders(204, -1);
                } catch (IOException ex) {
                    Logger.getLogger(HTMLGuiPostRequestHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        return task;
    }

    @Override
    public String getHandlerName() {
        return this.getClass().toString();
    }

}
