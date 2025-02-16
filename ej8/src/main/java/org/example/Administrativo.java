package org.example;

public class Administrativo implements Empleado{

    private int salarioBase;

    public  Administrativo(int salarioBase){
        this.salarioBase = salarioBase;
    }
    @Override
    public int calcularSalario() {
        return salarioBase;
    }

    @Override
    public String obtenerCargo() {
        return "Administrativo";

    }
}
