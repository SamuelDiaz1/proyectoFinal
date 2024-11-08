package co.edu.uniquindio.poo.decorador;

import co.edu.uniquindio.poo.Bebida;

public class HieloDecorator implements Bebida {
    private Bebida bebida;
    public HieloDecorator(Bebida bebida) { this.bebida = bebida; }

    public String getDescripcion() { return bebida.getDescripcion() + " con hielo"; }

}