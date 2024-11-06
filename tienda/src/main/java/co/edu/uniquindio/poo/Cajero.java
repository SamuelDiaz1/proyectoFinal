package co.edu.uniquindio.poo;

public class Cajero extends Empleado {
    int horasExtra;
    public Cajero(String nombre, String cedula, String edad, int salarioBase,int horasExtra) {
        super(nombre, cedula, edad, salarioBase);
        this.horasExtra=horasExtra;
    }
    @Override
    public int calcularSalario() {
        int total;
        total=salarioBase+horasExtra;
        return total;
    }


}
