package com.frank.simple_api_rest.services.Persona;

import com.frank.simple_api_rest.entities.Persona;
import com.frank.simple_api_rest.exeptionshandler.persona.PersonaNotFoundExeption;
import com.frank.simple_api_rest.exeptionshandler.persona.PersonaNotSavedExeption;
import com.frank.simple_api_rest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private PersonaRepository repository;

    @Override
    public List<Persona> findAll() throws Exception {
        try {
            return repository.findAll();
        } catch (Exception e) {
            throw  new Exception(e.getMessage(), e.getCause());
        }
    }

    @Override
    public Persona findById(Long id) throws PersonaNotFoundExeption {
        try {
            Optional<Persona> entity = repository.findById(id);
            return entity.get();
        } catch (Exception e) {
            throw  new PersonaNotFoundExeption(id, e.getMessage());
        }
    }

    @Override
    public Persona save(Persona entitie) throws PersonaNotSavedExeption {
        try {
            return repository.save(entitie);
        } catch (Exception e) {
            throw new PersonaNotSavedExeption(e.getMessage(), e.getCause());
        }
    }

    @Override
    public Persona update(Long id, Persona entitie) throws Exception {
        return null;
    }

    @Override
    public Boolean delete(Long id) throws Exception {
        return null;
    }
}
