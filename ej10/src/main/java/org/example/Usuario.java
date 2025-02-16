package org.example;

public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void hacerReserva(Reservable reservable, String fecha) {
        System.out.println(nombre + " está intentando reservar...");
        reservable.reservar(fecha);
    }
    public void cancelarReserva(Reservable reservable) {
        System.out.println(nombre + " está intentando cancelar una reserva...");
        reservable.cancelarReserva();
    }
}
