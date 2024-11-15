package co.edu.uniquindio.poo;

public class Administrador extends Persona implements Empleado {
    // constructor que inicializa los datos del administrador
    public Administrador(String nombre, String cedula, String edad) {
        super(nombre, cedula, edad);

    }

    /*
     * @param salarioBase
     * 
     * @param bonificación
     * Metodo para calcular el salario de un adminsitrador
     * 
     * @return salarioTotal
     */
    @Override
    public int calcularSalario(int salarioBase, int bonificacion) {
        if (salarioBase < 0 || bonificacion < 0) {
            throw new IllegalArgumentException("El salario base y la bonificación no pueden ser negativos");
        }
        int salarioTotal = salarioBase + bonificacion;
        return salarioTotal;
    }

}   