package com.frank.simple_api_rest.controllers;

import com.frank.simple_api_rest.entities.Persona;
import com.frank.simple_api_rest.responses.PersonaResponseEntity;
import com.frank.simple_api_rest.services.Persona.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping()
    public ResponseEntity<Object> getAll(){
        try {
            List<Persona> personas = personaService.findAll();
            return PersonaResponseEntity.buildResponse(HttpStatus.OK, personas, "Founded");
        } catch (Exception e) {
            return PersonaResponseEntity.buildResponse(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }
}
