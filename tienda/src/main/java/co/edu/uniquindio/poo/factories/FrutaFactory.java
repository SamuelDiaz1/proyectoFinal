package co.edu.uniquindio.poo.factories;

import co.edu.uniquindio.poo.Fruta;
import co.edu.uniquindio.poo.Producto;

public class FrutaFactory implements ProductoFactory {
    
    
    @Override
    public Producto crearProducto(String nombre, int precioVenta, String codigoProducto, int cantidad, Object peso) {
        return new Fruta(nombre, precioVenta, codigoProducto, cantidad, (double)peso);
    }
}

