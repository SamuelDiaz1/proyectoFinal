package co.edu.uniquindio.poo.factories;

import co.edu.uniquindio.poo.Cafe;
import co.edu.uniquindio.poo.Producto;

public class CafeFactory implements ProductoFactory {
    /**
     * @param nombre
     * @param precioVenta
     * @param codigoProducto
     * @param cantidad
     * Metodo para crear un cafe
     * @return Cafe
     */
    @Override
    public Producto crearProducto(String nombre, int precioVenta, String codigoProducto, int cantidad, Object extra) {
        return new Cafe(nombre, precioVenta, codigoProducto, cantidad);
    }
}
