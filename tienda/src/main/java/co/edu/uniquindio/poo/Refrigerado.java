package co.edu.uniquindio.poo;

public class Refrigerado extends Producto {
    private String tempGuardado;

    public Refrigerado(String nombre, int precioVenta, String codigoProducto, int inventario,
            String tempGuardado) {
        super(nombre, precioVenta, codigoProducto, inventario);
        this.tempGuardado = tempGuardado;
    }

    public String getTempGuardado() {
        return tempGuardado;
    }

    public void setTempGuardado(String tempGuardado) {
        this.tempGuardado = tempGuardado;
    }
    @Override
    public void mostrarInfoProducto() {
        super.mostrarInfoProducto();
        System.out.println("  -> Tipo: Refrigerado, Temperatura de Almacenamiento: " + tempGuardado + "°C");
    }
}
