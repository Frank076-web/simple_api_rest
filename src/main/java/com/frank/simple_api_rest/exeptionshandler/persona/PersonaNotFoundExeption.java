package com.frank.simple_api_rest.exeptionshandler.persona;

public class PersonaNotFoundExeption extends Exception{

    public PersonaNotFoundExeption(Long id, String message) {
        super("Error, persona con id: " + id + " no encontrada: " + message);
    }

}
