package co.edu.uniquindio.poo;

public class Cajero extends Persona implements Empleado {
    //Define el contructor de la clase cajero
    public Cajero(String nombre, String cedula, String edad) {
        super(nombre, cedula, edad);
        
    }

    /*
     * @param salarioBase
     * @param horasExtra
     * Metodo para calcular el salario de un cajero
     * @return salarioTotal
     */
    @Override
    public int calcularSalario(int salarioBase, int horasExtra) {
        int salarioTotal;
        salarioTotal=salarioBase+salarioBase*horasExtra/100;
        return salarioTotal;
    }
}
