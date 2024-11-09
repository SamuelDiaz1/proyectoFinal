package co.edu.uniquindio.poo.handlers;

public class CajeroDescuentoHandler extends DescuentoHandler{
    @Override
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje <= 5) {
            System.out.println("Cajero aprueba descuento de " + porcentaje + "%");
        } else if (nextHandler != null) {
            nextHandler.aplicarDescuento(porcentaje);
        }
    }
}
