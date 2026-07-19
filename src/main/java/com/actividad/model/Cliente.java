package com.actividad.model;

// 'extends Persona' significa que Cliente hereda todo de Persona
public class Cliente extends Persona {
    // Atributo propio y único de Cliente
    private int puntosAcumulados;

    // Constructor vacío
    public Cliente() {
        super(); // Llama al constructor vacío de Persona
    }

    // Constructor con parámetros
    public Cliente(String nombre, Rut rut, Direccion direccion, int puntosAcumulados) {
        // 'super' le pasa los datos comunes al constructor de la clase padre (Persona)
        super(nombre, rut, direccion); 
        this.puntosAcumulados = puntosAcumulados;
    }

    // Getter y Setter
    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    // Sobreescribimos el método para adaptarlo al Cliente
    @Override
    public void registrar() {
        System.out.println("Registrando Cliente en el sistema de fidelización: " + getNombre());
    }

    // Sobreescribimos para mostrar los datos del padre + los del Cliente
    @Override
    public String mostrarDatos() {
        return "[CLIENTE] " + super.mostrarDatos() + " | Puntos: " + puntosAcumulados;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + getNombre() + ", puntos=" + puntosAcumulados + '}';
    }
}