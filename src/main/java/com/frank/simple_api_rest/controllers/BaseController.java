package com.frank.simple_api_rest.controllers;

import com.frank.simple_api_rest.entities.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController<E extends BaseEntity, ID extends Serializable> {

    ResponseEntity<?> getAll();

    ResponseEntity<?> getOne(@PathVariable ID id);

    ResponseEntity<?> save(@RequestBody E entity);

    ResponseEntity<?> update(@RequestBody E entity);

    ResponseEntity<?> delete(@PathVariable ID id);

}
