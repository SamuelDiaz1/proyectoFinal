package co.edu.uniquindio.poo.decorador;

import co.edu.uniquindio.poo.Bebida;
/**
 * Decorador concreto que agrega hielo a una bebida.
 * Implementa la interfaz Bebida y extiende la funcionalidad de una bebida al añadir la descripción "con hielo".
 */
public class HieloDecorator implements Bebida {
    private Bebida bebida;

    /**
     * Constructor del decorador HieloDecorator.
     * @param bebida La bebida que se va a decorar con hielo.
     */
    public HieloDecorator(Bebida bebida) { this.bebida = bebida; }
    
    /**
     * Agrega la descripción "con hielo" a la bebida original.
     * @return Descripción de la bebida incluyendo el agregado de hielo.
     */
    @Override
    public String getDescripcion() { return bebida.getDescripcion() + " con hielo"; }


    public int getPrecio() {
        return bebida.getPrecio() + 500; // Suponiendo un costo extra de $0.50 por el hielo.
    }

}