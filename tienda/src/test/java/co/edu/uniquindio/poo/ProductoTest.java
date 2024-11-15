package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.jupiter.api.Test;

public class ProductoTest {
    @Test
    public void testGetNombre() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        assertEquals("Capuchino", producto.getNombre());
    }

    @Test
    public void testSetNombre() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        producto.setNombre("Latte");
        assertEquals("Latte", producto.getNombre());
    }

    @Test
    public void testGetPrecioVenta() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        assertEquals(5000, producto.getPrecioVenta());
    }

    @Test
    public void testSetPrecioVenta() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        producto.setPrecioVenta(5500);
        assertEquals(5500, producto.getPrecioVenta());
    }

    @Test
    public void testGetCodigoProducto() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        assertEquals("CAF001", producto.getCodigoProducto());
    }

    @Test
    public void testSetCodigoProducto() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        producto.setCodigoProducto("CAF002");
        assertEquals("CAF002", producto.getCodigoProducto());
    }

    @Test
    public void testGetCantidad() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        assertEquals(10, producto.getCantidad());
    }

    @Test
    public void testSetCantidad() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        producto.setCantidad(5);
        assertEquals(5, producto.getCantidad());
    }

    @Test
    public void testMostrarInfoProducto() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        producto.mostrarInfoProducto();
    }

    @Test
    public void testClonar() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        Producto clon = producto.clonar();
        assertNotSame(producto, clon);
        assertEquals(producto.getNombre(), clon.getNombre());
        assertEquals(producto.getPrecioVenta(), clon.getPrecioVenta());
        assertEquals(producto.getCodigoProducto(), clon.getCodigoProducto());
        assertEquals(producto.getCantidad(), clon.getCantidad());
    }

}
