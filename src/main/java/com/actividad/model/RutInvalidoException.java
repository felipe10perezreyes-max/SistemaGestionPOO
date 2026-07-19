package com.actividad.model;

// Esta clase hereda de Exception, lo que la convierte en un error propio del sistema
public class RutInvalidoException extends Exception {
    
    // Constructor que recibe el mensaje de error
    public RutInvalidoException(String mensaje) {
        super(mensaje);
    }
}