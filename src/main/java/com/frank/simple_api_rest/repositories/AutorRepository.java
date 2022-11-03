package com.frank.simple_api_rest.repositories;

import com.frank.simple_api_rest.entities.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {
}
