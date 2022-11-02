package com.frank.simple_api_rest.responses;

import com.frank.simple_api_rest.entities.Persona;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class PersonaResponseEntity {

    public static ResponseEntity<Object> buildResponse(HttpStatus status, Persona persona, String message){
        Map<String, Object> response = new HashMap<>();
        response.put("Status:", status);
        response.put("Data:", persona);
        response.put("Message:", message);

        return new ResponseEntity<Object>(response, status);
    }

}
