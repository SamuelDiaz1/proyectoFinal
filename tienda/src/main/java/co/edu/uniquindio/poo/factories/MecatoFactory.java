package co.edu.uniquindio.poo.factories;

import java.time.LocalDate;

import co.edu.uniquindio.poo.Mecato;
import co.edu.uniquindio.poo.Producto;

public class MecatoFactory implements ProductoFactory {
    /**
     * @param nombre
     * @param precioVenta
     * @param codigoProducto
     * @param cantidad
     * @param extra en este caso el extra seria un LocalDate
     * Metodo para crear un producto tipo mecato
     */
    @Override
    public Producto crearProducto(String nombre, int precioVenta, String codigoProducto, int cantidad, Object fechaCaducidad) {
        return new Mecato(nombre, precioVenta, codigoProducto, cantidad, (LocalDate) fechaCaducidad);
    }   
}
