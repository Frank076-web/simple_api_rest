package com.frank.simple_api_rest.responses;

import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract public class BaseResponseEntity {



    public static org.springframework.http.ResponseEntity<Object> buildResponse(HttpStatus status, String message){
        Map<String, Object> response = new HashMap<>();
        response.put("Status:", status);
        response.put("Data:", "No data");
        response.put("Message:", message);

        return new org.springframework.http.ResponseEntity<Object>(response, status);
    }

    public static org.springframework.http.ResponseEntity<Object> buildResponse(HttpStatus status, Object entity, String message){
        Map<String, Object> response = new HashMap<>();
        response.put("Status:", status);
        response.put("Data:", entity);
        response.put("Message:", message);

        return new org.springframework.http.ResponseEntity<Object>(response, status);
    }

    public org.springframework.http.ResponseEntity<Object> buildResponse(HttpStatus status, List<Object> entity, String message){
        Map<String, Object> response = new HashMap<>();
        response.put("Status:", status);
        response.put("Data:", entity);
        response.put("Message:", message);

        return new org.springframework.http.ResponseEntity<Object>(response, status);
    }

}
