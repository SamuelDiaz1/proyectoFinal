package co.edu.uniquindio.poo.factories;



import co.edu.uniquindio.poo.Gaseosa;
import co.edu.uniquindio.poo.Producto;

public class GaseosaFactory implements ProductoFactory {
    /**
     * @param nombre
     * @param precioVenta
     * @param codigoProducto
     * @param cantidad
     * @param extra en este caso seria un String
     * Metodo para crear un producto tipo Gaseosa
     */
    @Override
    public Producto crearProducto(String nombre, int precioVenta, String codigoProducto, int cantidad, Object extra) {
        return new Gaseosa(nombre, precioVenta, codigoProducto, cantidad,(String) extra );
    }
}
