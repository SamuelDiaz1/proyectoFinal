package co.edu.uniquindio.poo.handlers;

public class AdministradorHandler extends DescuentoHandler {
    @Override
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje <= 20) {
            System.out.println("Gerente aprueba descuento de " + porcentaje + "%");
        } else if (nextHandler != null) {
            nextHandler.aplicarDescuento(porcentaje);
        } else {
            System.out.println("Descuento de " + porcentaje + "% rechazado");
        }
    }
}
