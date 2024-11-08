package co.edu.uniquindio.poo;

public class Cajero extends Persona implements Empleado {
    
    public Cajero(String nombre, String cedula, String edad) {
        super(nombre, cedula, edad);
        
    }
    @Override
    public int calcularSalario(int salarioBase, int extra) {
        int salarioTotal;
        salarioTotal=salarioBase+salarioBase*extra/100;
       return salarioTotal;
    }
}
