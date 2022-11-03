package com.frank.simple_api_rest.controllers.Localidad;

import com.frank.simple_api_rest.controllers.BaseControllerImpl;
import com.frank.simple_api_rest.entities.Localidad;
import com.frank.simple_api_rest.services.Localidad.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}