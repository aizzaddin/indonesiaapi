package dev.wildan.indonesiaapi.config.response;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ResponseBuilder {
    public Map<String, Object> generateResponse(String message, Object data, HttpStatus httpStatus) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", message);
        response.put("code", httpStatus.value());
        response.put("timestamp", LocalDateTime.now());
        response.put("data", data);
        return response;
    }
}
