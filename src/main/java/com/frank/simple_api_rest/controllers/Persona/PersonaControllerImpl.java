package com.frank.simple_api_rest.controllers.Persona;

import com.frank.simple_api_rest.controllers.BaseControllerImpl;
import com.frank.simple_api_rest.entities.Persona;
import com.frank.simple_api_rest.responses.BaseResponseEntity;
import com.frank.simple_api_rest.services.Persona.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/personas")
public class PersonaControllerImpl extends BaseControllerImpl<Persona, PersonaServiceImpl> {

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro){
        try {
            return BaseResponseEntity.buildResponse(HttpStatus.OK, service.search(filtro), "OK");
        } catch (Exception e) {
            return BaseResponseEntity.buildResponse(HttpStatus.NOT_FOUND, "Error: no encontrado");
        }
    }

}
