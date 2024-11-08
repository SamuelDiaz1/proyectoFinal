package co.edu.uniquindio.poo.factories;

import co.edu.uniquindio.poo.Producto;

public interface ProductoFactory {
    Producto crearProducto(String nombre, int precioVenta, String codigoProducto, int cantidad, Object extra);
}
