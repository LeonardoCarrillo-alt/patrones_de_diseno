package org.example;

public class Hotel implements Reservable, Calificable{
    private String nombre;
    private boolean reservado;
    private int calificacion;

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.reservado = false;
        this.calificacion = 0;
    }

    @Override
    public void reservar(String fecha) {
        if (!reservado) {
            reservado = true;
            System.out.println("Hotel " + nombre + " reservado para la fecha: " + fecha);
        } else {
            System.out.println("Hotel " + nombre + " ya está reservado.");
        }
    }

    @Override
    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("Reserva del hotel " + nombre + " cancelada.");
        } else {
            System.out.println("El hotel " + nombre + " no tiene reservas activas.");
        }
    }

    @Override
    public void calificar(int estrellas) {
        if (estrellas >= 1 && estrellas <= 5) {
            calificacion = estrellas;
            System.out.println("Hotel " + nombre + " calificado con " + estrellas + " estrellas.");
        } else {
            System.out.println("La calificación debe ser entre 1 y 5 estrellas.");
        }
    }
    public String getNombre() {
        return nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }
}
