package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Producto producto1 = new Producto("Laptop", "Tecnología", 1200);
        Producto producto2 = new Producto("Smartphone", "Tecnología", 800);
        Producto producto3 = new Producto("Libro", "Educación", 20);
        Producto producto4 = new Producto("Cafetera", "Hogar", 50);

        // Lista de productos para un usuario
        List<Producto> historialCompras = Arrays.asList(producto1, producto2, producto3, producto4);

        // Crear usuarios
        UsuarioPremium usuarioPremium = new UsuarioPremium(historialCompras);
        UsuarioRegular usuarioRegular = new UsuarioRegular(historialCompras);

        // Sistema de recomendaciones
        SistemaRecomendaciones sistema = new SistemaRecomendaciones();

        // Mostrar recomendaciones para usuario premium
        System.out.println("Recomendaciones para Usuario Premium:");
        sistema.mostrarRecomendaciones(usuarioPremium);

        // Mostrar recomendaciones para usuario regular
        System.out.println("\nRecomendaciones para Usuario Regular:");
        sistema.mostrarRecomendaciones(usuarioRegular);
    }
}