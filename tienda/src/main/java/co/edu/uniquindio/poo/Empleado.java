package co.edu.uniquindio.poo;

public abstract class Empleado extends Persona{
    protected int salarioBase;

    public Empleado(String nombre, String cedula, String edad, int salarioBase) {
        super(nombre, cedula, edad);
        this.salarioBase = salarioBase;
    }
    public abstract int calcularSalario();

}
