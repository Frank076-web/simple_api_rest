package com.frank.simple_api_rest.services.Localidad;

import com.frank.simple_api_rest.entities.Localidad;
import com.frank.simple_api_rest.repositories.BaseRepository;
import com.frank.simple_api_rest.repositories.LocalidadRepository;
import com.frank.simple_api_rest.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository repository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> repository) {
        super(repository);
    }
}
