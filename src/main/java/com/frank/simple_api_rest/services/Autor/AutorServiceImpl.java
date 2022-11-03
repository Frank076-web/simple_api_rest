package com.frank.simple_api_rest.services.Autor;

import com.frank.simple_api_rest.entities.Autor;
import com.frank.simple_api_rest.repositories.AutorRepository;
import com.frank.simple_api_rest.repositories.BaseRepository;
import com.frank.simple_api_rest.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository repository;

    public AutorServiceImpl(BaseRepository<Autor, Long> repository) {
        super(repository);
    }

}
