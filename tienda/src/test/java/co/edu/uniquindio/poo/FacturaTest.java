package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FacturaTest {

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

    @Test
    public void testAgregarProductoAFacturaThrowsExceptionForNullProducto() {
        Factura factura = new Factura("FAC002");
        assertThrows(IllegalArgumentException.class, () -> {
            factura.agregarProductoAFactura(null, 5);
        });
    }

    @Test
    public void testAgregarProductoAFacturaThrowsExceptionForNegativeCantidad() {
        Producto producto = new Producto("Latte", 6000, "CAF002", 10);
        Factura factura = new Factura("FAC003");
        assertThrows(IllegalArgumentException.class, () -> {
            factura.agregarProductoAFactura(producto, -3);
        });
    }

    @Test
    public void testAgregarProductoAFacturaThrowsExceptionForCantidadExceedsStock() {
        Producto producto = new Producto("Mocha", 7000, "CAF003", 5);
        Factura factura = new Factura("FAC004");
        assertThrows(IllegalArgumentException.class, () -> {
            factura.agregarProductoAFactura(producto, 10);
        });
    }

    @Test
    public void testCalcularTotal() {
        Producto capuchino = new Producto("Capuchino", 5000, "CAF001", 10);
        Producto latte = new Producto("Latte", 6000, "CAF002", 8);
        Factura factura = new Factura("FAC005");
        factura.agregarProductoAFactura(capuchino, 4);
        factura.agregarProductoAFactura(latte, 2);
        double total = factura.calcularTotal();
        assertEquals(38000, total);
    }

    @Test
    public void testMostrarFactura() {
        Producto capuchino = new Producto("Capuchino", 5000, "CAF001", 10);
        Producto latte = new Producto("Latte", 6000, "CAF002", 8);
        Factura factura = new Factura("FAC006");
        factura.agregarProductoAFactura(capuchino, 4);
        factura.agregarProductoAFactura(latte, 2);
        factura.mostrarFactura();
    } 

}
