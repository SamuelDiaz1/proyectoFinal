package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.jupiter.api.Test;

public class ProductoTest {

    /**
     * Prueba que verifica la obtención del nombre del producto.
     * Se espera que el nombre del producto se obtenga correctamente.
     */
    @Test
    public void testGetNombre() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        assertEquals("Capuchino", producto.getNombre());
    }

    /**
     * Prueba que verifica el cambio del nombre del producto.
     * Se espera que el nombre del producto se actualice correctamente.
     */
    @Test
    public void testSetNombre() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        producto.setNombre("Latte");
        assertEquals("Latte", producto.getNombre());
    }

    /**
     * Prueba que verifica la obtención del precio de venta del producto.
     * Se espera que el precio de venta del producto se obtenga correctamente.
     */
    @Test
    public void testGetPrecioVenta() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        assertEquals(5000, producto.getPrecioVenta());
    }

    /**
     * Prueba que verifica el cambio del precio de venta del producto.
     * Se espera que el precio de venta del producto se actualice correctamente.
     */
    @Test
    public void testSetPrecioVenta() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        producto.setPrecioVenta(6000);
        assertEquals(6000, producto.getPrecioVenta());
    }

    /**
     * Prueba que verifica la obtención del código del producto.
     * Se espera que el código del producto se obtenga correctamente.
     */
    @Test
    public void testGetCodigoProducto() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        assertEquals("CAF001", producto.getCodigoProducto());
    }

    /**
     * Prueba que verifica el cambio del código del producto.
     * Se espera que el código del producto se actualice correctamente.
     */
    @Test
    public void testSetCodigoProducto() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        producto.setCodigoProducto("CAF002");
        assertEquals("CAF002", producto.getCodigoProducto());
    }

    /**
     * Prueba que verifica la obtención de la cantidad del producto.
     * Se espera que la cantidad del producto se obtenga correctamente.
     */
    @Test
    public void testGetCantidad() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        assertEquals(10, producto.getCantidad());
    }

    /**
     * Prueba que verifica el cambio de la cantidad del producto.
     * Se espera que la cantidad del producto se actualice correctamente.
     */
    @Test
    public void testSetCantidad() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        producto.setCantidad(5);
        assertEquals(5, producto.getCantidad());
    }

    /**
     * Prueba que verifica la visualización de la información del producto.
     * Se espera que la información del producto se muestre correctamente.
     */
    @Test
    public void testMostrarInfoProducto() {
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        producto.mostrarInfoProducto();
    }

    /**
     * Prueba que verifica la clonación de un producto.
     * Se espera que el producto clonado tenga los mismos atributos que el producto original.
     */
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
