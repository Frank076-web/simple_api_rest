package com.frank.simple_api_rest.services;

import java.util.List;

public interface BaseService<T> {

    List<T> findAll() throws Exception;

    T findById(Long id) throws Exception;

    T save(T entitie) throws Exception;

    T update (T entitie) throws Exception;

    Boolean delete(Long id) throws  Exception;
}
