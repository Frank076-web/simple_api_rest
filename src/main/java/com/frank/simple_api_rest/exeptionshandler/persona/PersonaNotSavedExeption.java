package com.frank.simple_api_rest.exeptionshandler.persona;

public class PersonaNotSavedExeption extends Exception{

    public PersonaNotSavedExeption(String message, Throwable cause) {
        super("Error, no se pudo guardar los datos: " + message, cause);
    }
}
