package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.visitor.FacturaVisitor;

public class Cafe extends Producto implements Bebida {
    public Cafe(String nombre, int precioVenta, String codigoProducto, int stock) {
            super(nombre, precioVenta, codigoProducto, stock);
    }

    public String getDescripcion() { 
        return "Café"; 
    }
    @Override
    public void accept(FacturaVisitor visitor) {
        visitor.visit(this);
    }
}
