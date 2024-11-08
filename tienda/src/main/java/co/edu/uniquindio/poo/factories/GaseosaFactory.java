package co.edu.uniquindio.poo.factories;

import co.edu.uniquindio.poo.Cafe;
import co.edu.uniquindio.poo.Producto;

public class GaseosaFactory implements ProductoFactory {
    @Override
    public Producto crearProducto(String nombre, int precioVenta, String codigoProducto, int cantidad, Object extra) {
        return new Cafe(nombre, precioVenta, codigoProducto, cantidad);
    }
}
