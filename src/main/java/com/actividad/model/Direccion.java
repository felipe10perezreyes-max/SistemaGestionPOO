package com.actividad.model;

public class Direccion {
    // Atributos privados (Encapsulamiento)
    private String calle;
    private int numero;
    private String ciudad;

    // Constructor vacío
    public Direccion() {
    }

    // Constructor con parámetros
    public Direccion(String calle, int numero, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
    }

    // Métodos Getter y Setter (Para acceder y modificar los datos de forma segura)
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // Método toString (Para mostrar los datos ordenados en consola)
    @Override
    public String toString() {
        return calle + " #" + numero + ", " + ciudad;
    }
}