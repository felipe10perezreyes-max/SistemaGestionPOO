package com.actividad.model;

// Usamos 'implements Registrable' para cumplir con el contrato de la interfaz
public class Persona implements Registrable {
    // Atributos privados (Encapsulamiento)
    private String nombre;
    
    // COMPOSICIÓN: Usamos nuestras clases como tipos de datos
    private Rut rut;
    private Direccion direccion;

    // Constructor vacío
    public Persona() {
    }

    // Constructor con parámetros
    public Persona(String nombre, Rut rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    // Métodos obligatorios de la interfaz Registrable (@Override)
    @Override
    public void registrar() {
        System.out.println("Registrando a la persona: " + this.nombre);
    }

    @Override
    public String mostrarDatos() {
        return "Nombre: " + nombre + " | RUT: " + rut + " | Dirección: " + direccion;
    }

    // Método toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", rut=" + rut + ", direccion=" + direccion + '}';
    }
}