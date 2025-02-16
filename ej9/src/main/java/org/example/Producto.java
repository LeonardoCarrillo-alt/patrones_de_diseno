package org.example;

public class Producto {
    private String nombre;
    private String categoria;
    private int precio;

    public Producto(String nombre, String categoria, int precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " (" + categoria + ") - $" + precio;
    }
}
