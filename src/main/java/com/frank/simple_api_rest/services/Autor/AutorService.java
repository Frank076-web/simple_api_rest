package com.frank.simple_api_rest.services.Autor;

import com.frank.simple_api_rest.entities.Autor;
import com.frank.simple_api_rest.repositories.AutorRepository;
import com.frank.simple_api_rest.repositories.BaseRepository;
import com.frank.simple_api_rest.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class AutorService extends BaseServiceImpl<Autor, Long> implements IAutorService {

    @Autowired
    private AutorRepository repository;

    public AutorService(BaseRepository<Autor, Long> repository) {
        super(repository);
    }

}
