package com.frank.simple_api_rest.controllers;

import com.frank.simple_api_rest.entities.Autor;
import com.frank.simple_api_rest.services.Autor.AutorServiceImpl;
import com.frank.simple_api_rest.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

public class AutorController extends BaseController<Autor, Long> {

    @Autowired
    private AutorServiceImpl service;

    public AutorController(BaseService<Autor, Long> service) {
        super(service);
    }

}
