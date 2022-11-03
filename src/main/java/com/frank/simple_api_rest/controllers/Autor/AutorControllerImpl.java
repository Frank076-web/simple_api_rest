package com.frank.simple_api_rest.controllers.Autor;

import com.frank.simple_api_rest.controllers.BaseControllerImpl;
import com.frank.simple_api_rest.entities.Autor;
import com.frank.simple_api_rest.services.Autor.AutorServiceImpl;
import com.frank.simple_api_rest.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/autores")
public class AutorControllerImpl extends BaseControllerImpl<Autor, Long> {

    @Autowired
    private AutorServiceImpl service;

    public AutorControllerImpl(BaseService<Autor, Long> service) {
        super(service);
    }

}
