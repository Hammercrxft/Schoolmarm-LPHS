/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.espercroft.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author fille
 */
public class EsperUtil {
    public static Map<String, String> parseRequestBody(String requestBody) {
        Map<String, String> parameters = new HashMap<>();

        // Split the parameters
        String[] pairs = requestBody.split("&");

        // Decode and store key-value pairs in the map
        for (String pair : pairs) {
            String[] keyValue = pair.split("=");
            try {
                String key = URLDecoder.decode(keyValue[0], "UTF-8");
                String value = URLDecoder.decode(keyValue[1], "UTF-8");
                parameters.put(key, value);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace(); // Handle encoding exception as needed
            }
        }

        return parameters;
    }
    public static Map<String, String> parseQueryString(String queryString) {
        Map<String, String> queryParams = new HashMap<>();

        // Split the query string into individual key-value pairs
        String[] pairs = queryString.split("&");

        // Process each key-value pair
        for (String pair : pairs) {
            // Split the pair into key and value
            String[] keyValue = pair.split("=");

            // Check if the pair is well-formed
            if (keyValue.length == 2) {
                // Decode the key and value (optional, depending on your use case)
                String key = decodeUrlComponent(keyValue[0]);
                String value = decodeUrlComponent(keyValue[1]);

                // Put the key-value pair into the map
                queryParams.put(key, value);
            }
        }

        return queryParams;
    }
    // Optional: URL decode the components (depends on your use case)
    public static String decodeUrlComponent(String component) {
        try {
            return java.net.URLDecoder.decode(component, "UTF-8");
        } catch (java.io.UnsupportedEncodingException e) {
            // Handle the exception, or throw it as needed
            e.printStackTrace();
            return component;
        }
    }
}
