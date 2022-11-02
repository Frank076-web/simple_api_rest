package com.frank.simple_api_rest.exeptionshandler.persona;

public class PersonaNotDeletedExeption extends Exception{

    public PersonaNotDeletedExeption(Long id, String message, Throwable cause) {
        super("Error: no se pudo eliminar la persona con id: " + id + " " + message, cause);
    }

}
