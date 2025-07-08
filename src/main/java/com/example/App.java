package com.example;

import org.apache.log4j.Logger;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    private static final Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Starting the app...");

        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = "{\"message\":\"Hello, Dependabot!\"}";
            Message msg = mapper.readValue(json, Message.class);
            logger.info("Parsed message: " + msg.getMessage());
        } catch (Exception e) {
            logger.error("Error parsing JSON", e);
        }
    }

    public static class Message {
        private String message;
        public String getMessage() { return message; }
        public void setMessage(String message) { this.message = message; }
    }
}
