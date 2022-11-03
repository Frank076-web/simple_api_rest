package com.frank.simple_api_rest.services;

import com.frank.simple_api_rest.entities.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends BaseEntity, ID extends Serializable> {

    List<E> findAll() throws Exception;

    E findById(ID id) throws Exception;

    E save(E entitie) throws Exception;

    E update (E entitie) throws Exception;

    Boolean delete(ID id) throws  Exception;
}
