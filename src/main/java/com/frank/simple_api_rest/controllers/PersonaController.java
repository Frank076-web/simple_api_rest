package com.frank.simple_api_rest.controllers;

import com.frank.simple_api_rest.entities.Persona;
import com.frank.simple_api_rest.services.BaseService;
import com.frank.simple_api_rest.services.Persona.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/personas")
public class PersonaController extends BaseController<Persona, Long> {

    @Autowired
    private PersonaServiceImpl personaServiceImpl;

    public PersonaController(BaseService<Persona, Long> service) {
        super(service);
    }

}
