package com.frank.simple_api_rest.services.Persona;

import com.frank.simple_api_rest.entities.Persona;
import com.frank.simple_api_rest.services.BaseService;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long> {

    List<Persona> search(String filtro) throws Exception;

}
