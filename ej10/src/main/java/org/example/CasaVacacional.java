package org.example;

public class CasaVacacional implements Reservable{
    private String nombre;
    private boolean reservado;

    public CasaVacacional(String nombre) {
        this.nombre = nombre;
        this.reservado = false;
    }

    @Override
    public void reservar(String fecha) {
        if (!reservado) {
            reservado = true;
            System.out.println("Casa vacacional " + nombre + " reservada para la fecha: " + fecha);
        } else {
            System.out.println("Casa vacacional " + nombre + " ya está reservada.");
        }
    }

    @Override
    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("Reserva de la casa vacacional " + nombre + " cancelada.");
        } else {
            System.out.println("La casa vacacional " + nombre + " no tiene reservas activas.");
        }
    }

    public String getNombre() {
        return nombre;
    }
}
