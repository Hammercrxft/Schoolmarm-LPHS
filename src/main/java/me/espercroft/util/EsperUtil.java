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
}
