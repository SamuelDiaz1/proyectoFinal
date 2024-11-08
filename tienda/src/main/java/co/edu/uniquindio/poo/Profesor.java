package co.edu.uniquindio.poo;

public class Profesor extends Persona implements Cliente{
    private TipoProfesor tipoProfesor;
    public Profesor(String nombre, String cedula, String edad, TipoProfesor tipoProfesor) {
        super(nombre, cedula, edad);
        this.tipoProfesor = tipoProfesor;
    }
    public TipoProfesor getTipoProfesor() {
        return tipoProfesor;
    }
    public void setTipoProfesor(TipoProfesor tipoProfesor) {
        this.tipoProfesor = tipoProfesor;
    }
    public double calcularPorcentajeDescuento(){
        double descuento;
        switch (tipoProfesor) {
            case SUPLENTE:
                descuento=0.05;                
            case ASOCIADO:
                descuento=0.1;
            case TITULAR:
                descuento=0.15;
            return descuento;
            default:
                throw new IllegalArgumentException("Tipo de profesor no valido");               
        }        
    }    
}
