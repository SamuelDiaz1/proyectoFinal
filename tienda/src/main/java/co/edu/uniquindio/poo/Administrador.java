package co.edu.uniquindio.poo;

public class Administrador extends Persona implements Empleado  {
    
    public Administrador(String nombre, String cedula, String edad) {
        super(nombre, cedula, edad);
        
    }
    @Override
    public int calcularSalario(int salarioBase, int bonificacion) {
        int salarioTotal;
        salarioTotal=salarioBase+bonificacion;
        return salarioTotal;
    }
     
}