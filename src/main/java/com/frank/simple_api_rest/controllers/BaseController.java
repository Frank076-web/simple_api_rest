package com.frank.simple_api_rest.controllers;

import com.frank.simple_api_rest.entities.BaseEntity;
import com.frank.simple_api_rest.responses.BaseResponseEntity;
import com.frank.simple_api_rest.services.BaseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
abstract public class BaseController<E extends BaseEntity, ID extends Serializable> {

    protected BaseService<E, ID> service;

    public BaseController(BaseService<E, ID> service) {
        this.service = service;
    }

    @GetMapping("")
    public org.springframework.http.ResponseEntity<Object> getAll() {
        try {
            List<E> entity = service.findAll();
            return BaseResponseEntity.buildResponse(HttpStatus.OK, entity, "Encontrado");
        } catch (Exception e) {
            return BaseResponseEntity.buildResponse(HttpStatus.NOT_FOUND, "Error, no se pudo encontrar. Por favor intente de nuevo mas tarde");
        }
    }

    @GetMapping("/{id}")
    public org.springframework.http.ResponseEntity<Object> getOne(@PathVariable ID id) {
        try {
            E baseEntity = service.findById(id);
            return BaseResponseEntity.buildResponse(HttpStatus.OK, baseEntity, "Encontrado");
        } catch (Exception e) {
            return BaseResponseEntity.buildResponse(HttpStatus.NOT_FOUND, "Error, no se pudo encontrar la persona solicitada. Por favor intente de nuevo mas tarde");
        }
    }

    @PostMapping("")
    public org.springframework.http.ResponseEntity<Object> save(@RequestBody E entity) {
        try {
            E baseEntity = service.save(entity);
            return BaseResponseEntity.buildResponse(HttpStatus.CREATED, entity, "Guardado correctamente");
        } catch (Exception e) {
            return BaseResponseEntity.buildResponse(HttpStatus.BAD_REQUEST, "Error, no se pudo guardar. Por favor intente de nuevo mas tarde");
        }
    }

    @PutMapping("")
    public org.springframework.http.ResponseEntity<Object> update(@RequestBody E entity) {
        try {
            E baseEntity = service.update(entity);
            return BaseResponseEntity.buildResponse(HttpStatus.OK, entity, "Actualizado correctamente");
        } catch (Exception e) {
            return BaseResponseEntity.buildResponse(HttpStatus.BAD_REQUEST, "Error, no se pudo actualizar. Por favor intente de nuevo mas tarde");
        }
    }

    @DeleteMapping("/{id}")
    public org.springframework.http.ResponseEntity<Object> delete(@PathVariable ID id) {
        try {
            service.delete(id);
            return BaseResponseEntity.buildResponse(HttpStatus.OK, "Eliminado correctamente");
        } catch (Exception e) {
            return BaseResponseEntity.buildResponse(HttpStatus.BAD_REQUEST, "Error, no se pudo eliminar. Por favor intente de nuevo mas tarde");
        }
    }

}
