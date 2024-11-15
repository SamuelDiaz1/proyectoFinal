package co.edu.uniquindio.poo.decorador;

import co.edu.uniquindio.poo.Bebida;

public class LecheDecorator implements Bebida{
    private Bebida bebida;
    /**
     * Constructor del decorador LecheDecorator.
     * @param bebida La bebida que se va a decorar con leche.
     */
    public LecheDecorator(Bebida bebida) { this.bebida = bebida; }
    
    /**
     * Agrega la descripción "con hielo" a la bebida original.
     * @return Descripción de la bebida incluyendo el agregado de hielo.
     */
    @Override
    public String getDescripcion() { return bebida.getDescripcion() + " con Leche"; }
    
    
    @Override
    public int getPrecio() {
        return bebida.getPrecio() + 500; // Suponiendo un costo extra de $0.50 por el hielo.
    }
}
