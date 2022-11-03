package com.frank.simple_api_rest.services.Persona;

import com.frank.simple_api_rest.entities.Persona;
import com.frank.simple_api_rest.exeptionshandler.persona.PersonaNotDeletedExeption;
import com.frank.simple_api_rest.exeptionshandler.persona.PersonaNotFoundExeption;
import com.frank.simple_api_rest.exeptionshandler.persona.PersonaNotSavedExeption;
import com.frank.simple_api_rest.exeptionshandler.persona.PersonaNotUpdatedExeption;
import com.frank.simple_api_rest.repositories.BaseRepository;
import com.frank.simple_api_rest.repositories.PersonaRepository;
import com.frank.simple_api_rest.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaService extends BaseServiceImpl<Persona, Long> {

    @Autowired
    private PersonaRepository repository;

    public PersonaService(BaseRepository<Persona, Long> repository) {
        super(repository);
    }
}
