package co.edu.uniquindio.poo;

public class Administrador extends Empleado  {
    private int bonificacion;

    public Administrador(String nombre, String cedula, String edad, int salarioBase, int bonificacion) {
        super(nombre, cedula, edad, salarioBase);
        this.bonificacion = bonificacion;
    }

    @Override
    public int calcularSalario() {
        int salarioTotal;
        salarioTotal=salarioBase+bonificacion;
        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
    }
     
}