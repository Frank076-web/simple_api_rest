package com.frank.simple_api_rest.controllers.Persona;

import com.frank.simple_api_rest.controllers.BaseControllerImpl;
import com.frank.simple_api_rest.entities.Persona;
import com.frank.simple_api_rest.services.BaseService;
import com.frank.simple_api_rest.services.Persona.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/personas")
public class PersonaControllerImpl extends BaseControllerImpl<Persona, PersonaServiceImpl> {

}
