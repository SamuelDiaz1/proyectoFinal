package co.edu.uniquindio.poo.handlers;

public abstract class DescuentoHandler {
    protected DescuentoHandler nextHandler;

    public void setNextHandler(DescuentoHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void aplicarDescuento(double porcentaje);
}
