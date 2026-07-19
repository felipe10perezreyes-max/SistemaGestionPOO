package com.actividad.model;

public class Empleado extends Persona {
    // Atributo propio y único de Empleado
    private String cargo;

    // Constructor vacío
    public Empleado() {
        super();
    }

    // Constructor con parámetros
    public Empleado(String nombre, Rut rut, Direccion direccion, String cargo) {
        super(nombre, rut, direccion);
        this.cargo = cargo;
    }

    // Getter y Setter
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Sobreescribimos el método para adaptarlo al Empleado
    @Override
    public void registrar() {
        System.out.println("Registrando Empleado en el sistema de recursos humanos: " + getNombre());
    }

    // Sobreescribimos para mostrar los datos del padre + los del Empleado
    @Override
    public String mostrarDatos() {
        return "[EMPLEADO] " + super.mostrarDatos() + " | Cargo: " + cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + getNombre() + ", cargo=" + cargo + '}';
    }
}