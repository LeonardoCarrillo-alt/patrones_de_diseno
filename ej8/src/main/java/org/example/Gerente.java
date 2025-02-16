package org.example;

public class Gerente implements Empleado, Bolificable{

    private int salarioBase;
    private int bono;
    public Gerente (int salarioBase, int bono ){
        this.salarioBase = salarioBase;
        this.bono = bono;
    }
    @Override
    public int calcularSalario() {
        return salarioBase + calcularBono();

    }

    @Override
    public String obtenerCargo() {
        return "Gerente";

    }

    @Override
    public int calcularBono() {
        return bono;

    }
}
