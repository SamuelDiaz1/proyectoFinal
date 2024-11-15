package co.edu.uniquindio.poo.handlers;

public abstract class DescuentoHandler {
    protected DescuentoHandler nextHandler;
    /**
     * Método para establecer el siguiente manejador en la cadena.
     * Esto permite que la solicitud sea pasada de un manejador a otro hasta que alguno la procese
     * o todos la rechacen.
     *
     * @param nextHandler El siguiente manejador en la cadena de responsabilidad.
     */
    public void setNextHandler(DescuentoHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    /**
     * Método abstracto para aplicar un descuento.
     * Cada clase que extienda DescuentoHandler debe implementar este método, 
     * determinando si puede aprobar el descuento o si debe pasarlo al siguiente manejador.
     *
     * @param porcentaje Porcentaje de descuento solicitado.
     */
    public abstract void aplicarDescuento(double porcentaje);
}
