package org.example;

public class Departamento implements Reservable{

    private String nombre;
    private boolean reservado;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.reservado = false;
    }

    @Override
    public void reservar(String fecha) {
        if (!reservado) {
            reservado = true;
            System.out.println("Departamento " + nombre + " reservado para la fecha: " + fecha);
        } else {
            System.out.println("Departamento " + nombre + " ya está reservado.");
        }
    }

    @Override
    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("Reserva del departamento " + nombre + " cancelada.");
        } else {
            System.out.println("El departamento " + nombre + " no tiene reservas activas.");
        }
    }
    public String getNombre() {
        return nombre;
    }
}
