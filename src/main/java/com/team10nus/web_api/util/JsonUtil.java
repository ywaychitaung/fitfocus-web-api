package com.team10nus.web_api.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

public class JsonUtil {
    public static String convertObjectToJson(Object obj) {
        // Convert the object to JSON string
        ObjectMapper objectMapper = new ObjectMapper();

        // Handle exception: logging, throw a custom exception, etc.
        String jsonString = "";
        try {
            jsonString = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            // Handle exception: logging, throw a custom exception, etc.
        }
        return jsonString;
    }
}
