package co.edu.uniquindio.poo;

public class Estudiante extends Persona implements Cliente{
    public double semestre;

    public Estudiante(String nombre, String cedula, String edad, double semestre) {
        super(nombre, cedula, edad);
        this.semestre = semestre;
    }
    public double calcularPorcentajeDescuento(){
        double descuento;
        descuento =semestre*0.1; 
        return descuento;
    }
    
    
}
