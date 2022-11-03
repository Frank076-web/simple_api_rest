package com.frank.simple_api_rest.controllers;

import com.frank.simple_api_rest.entities.BaseEntity;
import com.frank.simple_api_rest.responses.BaseResponseEntity;
import com.frank.simple_api_rest.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

abstract public class BaseControllerImpl<E extends BaseEntity, S extends BaseServiceImpl<E, Long>> implements BaseController<E, Long> {

    @Autowired
    protected S service;

    @GetMapping("")
    public ResponseEntity<Object> getAll() {
        try {
            List<E> entity = service.findAll();
            return BaseResponseEntity.buildResponse(HttpStatus.OK, entity, "Encontrado");
        } catch (Exception e) {
            return BaseResponseEntity.buildResponse(HttpStatus.NOT_FOUND, "Error, no se pudo encontrar. Por favor intente de nuevo mas tarde");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOne(@PathVariable Long id) {
        try {
            E baseEntity = service.findById(id);
            return BaseResponseEntity.buildResponse(HttpStatus.OK, baseEntity, "Encontrado");
        } catch (Exception e) {
            return BaseResponseEntity.buildResponse(HttpStatus.NOT_FOUND, "Error, no se pudo encontrar la solicitud. Por favor intente de nuevo mas tarde");
        }
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody E entity) {
        try {
            E baseEntity = service.save(entity);
            return BaseResponseEntity.buildResponse(HttpStatus.CREATED, baseEntity, "Guardado correctamente");
        } catch (Exception e) {
            return BaseResponseEntity.buildResponse(HttpStatus.BAD_REQUEST, "Error, no se pudo guardar. Por favor intente de nuevo mas tarde " + e.getCause());
        }
    }

    @PutMapping("")
    public ResponseEntity<Object> update(@RequestBody E entity) {
        try {
            E baseEntity = service.update(entity);
            return BaseResponseEntity.buildResponse(HttpStatus.OK, entity, "Actualizado correctamente");
        } catch (Exception e) {
            return BaseResponseEntity.buildResponse(HttpStatus.BAD_REQUEST, "Error, no se pudo actualizar. Por favor intente de nuevo mas tarde");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        try {
            service.delete(id);
            return BaseResponseEntity.buildResponse(HttpStatus.OK, "Eliminado correctamente");
        } catch (Exception e) {
            return BaseResponseEntity.buildResponse(HttpStatus.BAD_REQUEST, "Error, no se pudo eliminar. Por favor intente de nuevo mas tarde");
        }
    }

}
