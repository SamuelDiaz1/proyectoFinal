package co.edu.uniquindio.poo.handlers;

public class CajeroDescuentoHandler extends DescuentoHandler{
        /**
     * Método que procesa el descuento solicitado.
     * Si el porcentaje de descuento es menor o igual a 5%, el cajero aprueba el descuento.
     * Si el porcentaje es mayor y existe otro manejador en la cadena, la solicitud es pasada al siguiente manejador.
     * Si no hay un siguiente manejador, se rechaza la solicitud.
     *
     * @param porcentaje Porcentaje de descuento solicitado.
     */
    @Override
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje <= 5) {
            System.out.println("Cajero aprueba descuento de " + porcentaje + "%");
        } else if (nextHandler != null) {
            nextHandler.aplicarDescuento(porcentaje);
        }
    }
}
