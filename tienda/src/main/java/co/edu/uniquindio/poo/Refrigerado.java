package co.edu.uniquindio.poo;

public class Refrigerado extends Producto{
    private String tempGuardado;

    public Refrigerado(String nombre, int precioVenta, int precioCompra, String codigoProducto, int stock,
            String tempGuardado) {
        super(nombre, precioVenta, precioCompra, codigoProducto, stock);
        this.tempGuardado = tempGuardado;
    }

    public String getTempGuardado() {
        return tempGuardado;
    }

    public void setTempGuardado(String tempGuardado) {
        this.tempGuardado = tempGuardado;
    }
    
}
