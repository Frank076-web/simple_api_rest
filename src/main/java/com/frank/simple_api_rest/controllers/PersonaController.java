package com.frank.simple_api_rest.controllers;

import com.frank.simple_api_rest.entities.Persona;
import com.frank.simple_api_rest.responses.PersonaResponseEntity;
import com.frank.simple_api_rest.services.Persona.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("")
    public ResponseEntity<Object> getAll(){
        try {
            List<Persona> personas = personaService.findAll();
            return PersonaResponseEntity.buildResponse(HttpStatus.OK, personas, "Encontrado");
        } catch (Exception e) {
            return PersonaResponseEntity.buildResponse(HttpStatus.NOT_FOUND, "Error, no se pudo encontrar. Por favor intente de nuevo mas tarde");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOne(@PathVariable Long id) {
        try {
            Persona persona = personaService.findById(id);
            return PersonaResponseEntity.buildResponse(HttpStatus.OK, persona, "Encontrado");
        } catch (Exception e) {
            return PersonaResponseEntity.buildResponse(HttpStatus.NOT_FOUND, "Error, no se pudo encontrar la persona solicitada. Por favor intente de nuevo mas tarde");
        }
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody Persona entity) {
        try {
            Persona persona = personaService.save(entity);
            return PersonaResponseEntity.buildResponse(HttpStatus.CREATED, persona, "Guardado correctamente");
        } catch (Exception e) {
            return PersonaResponseEntity.buildResponse(HttpStatus.BAD_REQUEST, "Error, no se pudo guardar. Por favor intente de nuevo mas tarde");
        }
    }

    @PutMapping("")
    public ResponseEntity<Object> update(@RequestBody Persona entity) {
        try {
            Persona persona = personaService.update(entity);
            return PersonaResponseEntity.buildResponse(HttpStatus.OK, persona, "Actualizado correctamente");
        } catch (Exception e) {
            return PersonaResponseEntity.buildResponse(HttpStatus.BAD_REQUEST, "Error, no se pudo actualizar. Por favor intente de nuevo mas tarde");
        }
    }

}
