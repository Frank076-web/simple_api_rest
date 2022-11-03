package com.frank.simple_api_rest.services.Persona;

import com.frank.simple_api_rest.entities.Persona;
import com.frank.simple_api_rest.repositories.BaseRepository;
import com.frank.simple_api_rest.repositories.PersonaRepository;
import com.frank.simple_api_rest.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {

    @Autowired
    private PersonaRepository repository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> repository) {
        super(repository);
    }
}
