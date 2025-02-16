package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Empresa empresa = new Empresa();
        Administrativo admin = new Administrativo(4000);
        Tecnico tecnico = new Tecnico(4500, 20);
        Gerente gerente = new Gerente(8000, 500);
        empresa.agregarEmpleado(admin);
        admin.obtenerCargo();
        admin.calcularSalario();
        empresa.agregarEmpleado(tecnico);
        tecnico.calcularSalario();
        tecnico.obtenerCargo();
        empresa.agregarEmpleado(gerente);
        gerente.calcularBono();
        gerente.obtenerCargo();
        gerente.calcularSalario();
        empresa.mostrarEmpleados();
    }
}