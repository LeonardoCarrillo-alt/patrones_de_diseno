package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Hotel hotel = new Hotel("Hotel Plaza");
        Departamento departamento = new Departamento("Departamento en el Centro");
        CasaVacacional casa = new CasaVacacional("Casa en la Playa");


        Usuario usuario = new Usuario("Juan");


        usuario.hacerReserva(hotel, "2023-12-25");
        usuario.hacerReserva(departamento, "2023-12-26");
        usuario.hacerReserva(casa, "2023-12-27");


        usuario.cancelarReserva(hotel);

  
        hotel.calificar(4);


    }
}