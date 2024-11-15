package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FacturaTest {

    /**
     * Prueba que verifica la adición de un producto a la factura.
     * Se espera que el producto se agregue correctamente a la lista de productos de la factura.
     */
    @Test
    public void testAgregarProductoAFactura() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        Factura factura = new Factura("FAC001");
        factura.agregarProductoAFactura(producto, 5);
        List<Producto> productos = factura.getProductos();
        assertEquals(1, productos.size());
        assertEquals("Capuchino", productos.get(0).getNombre());
        assertEquals(5000, productos.get(0).getPrecioVenta());
        assertEquals(5, productos.get(0).getCantidad());
    }

    /**
     * Prueba que verifica que se lanza una excepción cuando se intenta agregar un producto nulo a la factura.
     * Se espera que se lance una IllegalArgumentException.
     */
    @Test
    public void testAgregarProductoAFacturaThrowsExceptionForNullProducto() {
        Factura factura = new Factura("FAC002");
        assertThrows(IllegalArgumentException.class, () -> {
            factura.agregarProductoAFactura(null, 5);
        });
    }

    /**
     * Prueba que verifica que se lanza una excepción cuando se intenta agregar una cantidad negativa de un producto a la factura.
     * Se espera que se lance una IllegalArgumentException.
     */
    @Test
    public void testAgregarProductoAFacturaThrowsExceptionForNegativeCantidad() {
        Producto producto = new Producto("Latte", 6000, "CAF002", 10);
        Factura factura = new Factura("FAC003");
        assertThrows(IllegalArgumentException.class, () -> {
            factura.agregarProductoAFactura(producto, -3);
        });
    }

    /**
     * Prueba que verifica que se lanza una excepción cuando se intenta agregar una cantidad de un producto que excede el stock disponible a la factura.
     * Se espera que se lance una IllegalArgumentException.
     */
    @Test
    public void testAgregarProductoAFacturaThrowsExceptionForCantidadExceedsStock() {
        Producto producto = new Producto("Mocha", 7000, "CAF003", 5);
        Factura factura = new Factura("FAC004");
        assertThrows(IllegalArgumentException.class, () -> {
            factura.agregarProductoAFactura(producto, 10);
        });
    }

    /**
     * Prueba que verifica el cálculo del total de la factura.
     * Se espera que el total sea la suma de los precios de los productos multiplicados por sus cantidades.
     */
    @Test
    public void testCalcularTotal() {
        Producto capuchino = new Producto("Capuchino", 5000, "CAF001", 10);
        Producto latte = new Producto("Latte", 6000, "CAF002", 8);
        Factura factura = new Factura("FAC005");
        factura.agregarProductoAFactura(capuchino, 4);
        factura.agregarProductoAFactura(latte, 3);
        assertEquals(47000, factura.calcularTotal()); // 4 * 5000 + 3 * 6000 = 20000 + 18000 = 38000
    }

}
