package com.actividad.model;

public class Rut {
    // Atributos privados
    private int numero;
    private char dv; // Dígito verificador (puede ser un número o una 'K')

    // Constructor vacío
    public Rut() {
    }

    // Constructor con parámetros que VALIDA el RUT (Usa nuestra excepción)
    public Rut(int numero, char dv) throws RutInvalidoException {
        // Validación simple: El número de RUT no puede ser negativo o cero
        if (numero <= 0) {
            throw new RutInvalidoException("El número de RUT debe ser mayor a cero.");
        }
        
        this.numero = numero;
        this.dv = Character.toUpperCase(dv); // Lo guardamos siempre en mayúscula (por si ponen 'k')
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws RutInvalidoException {
        if (numero <= 0) {
            throw new RutInvalidoException("El número de RUT debe ser mayor a cero.");
        }
        this.numero = numero;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = Character.toUpperCase(dv);
    }

    // Método toString para mostrar el RUT formateado (Ej: 12345678-K)
    @Override
    public String toString() {
        return numero + "-" + dv;
    }
}