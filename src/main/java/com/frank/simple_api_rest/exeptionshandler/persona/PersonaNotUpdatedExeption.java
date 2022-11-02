package com.frank.simple_api_rest.exeptionshandler.persona;

public class PersonaNotUpdatedExeption extends Exception{

    public PersonaNotUpdatedExeption(Long id, String message, Throwable cause) {
        super("Error, no se pudo actualizar la persona con id: " + id + " " +  message, cause);
    }
}
