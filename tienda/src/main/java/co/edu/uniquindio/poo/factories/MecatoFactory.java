package co.edu.uniquindio.poo.factories;

import java.time.LocalDate;

import co.edu.uniquindio.poo.Mecato;
import co.edu.uniquindio.poo.Producto;

public class MecatoFactory implements ProductoFactory {
@Override
    public Producto crearProducto(String nombre, int precioVenta, String codigoProducto, int cantidad, Object fechaCaducidad) {
        return new Mecato(nombre, precioVenta, codigoProducto, cantidad, (LocalDate) fechaCaducidad);
    }   
}
