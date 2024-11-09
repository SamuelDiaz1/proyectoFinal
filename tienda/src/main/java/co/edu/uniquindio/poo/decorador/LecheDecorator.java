package co.edu.uniquindio.poo.decorador;

import co.edu.uniquindio.poo.Bebida;

public class LecheDecorator implements Bebida{
    private Bebida bebida;
    public LecheDecorator(Bebida bebida) { this.bebida = bebida; }
    @Override
    public String getDescripcion() { return bebida.getDescripcion() + " con Leche"; }
 
}
