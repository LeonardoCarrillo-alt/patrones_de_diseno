package org.example;

public class Tecnico implements Empleado{

    private int salarioBase;
    private int horasExtra;

    public Tecnico(int salarioBase, int horasExtra){
        this.salarioBase = salarioBase;
        this.horasExtra=horasExtra;
    }
    @Override
    public int calcularSalario() {

        return salarioBase + (horasExtra * 20);

    }

    @Override
    public String obtenerCargo() {

        return "Tecnico";

    }
}
