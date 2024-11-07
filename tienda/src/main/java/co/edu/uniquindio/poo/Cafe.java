package co.edu.uniquindio.poo;

public class Cafe extends Producto implements Bebida {
    public Cafe(String nombre, int precioVenta, String codigoProducto, int stock) {
            super(nombre, precioVenta, codigoProducto, stock);
    }

    public String getDescripcion() { 
        return "Café"; 
    }
}
