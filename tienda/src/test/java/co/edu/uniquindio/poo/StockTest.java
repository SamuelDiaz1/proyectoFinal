package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StockTest {

    /**
     * Prueba que verifica la adición de un producto al stock.
     * Se espera que el producto se agregue correctamente al stock y se pueda buscar por su nombre.
     */
    @Test
    public void testAgregarProductoAStock() {
        Stock stock = new Stock();
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        stock.agregarProductoAStock(producto);
        Producto buscado = stock.buscarProducto("Capuchino");
        assertEquals(producto, buscado);
    }

    /**
     * Prueba que verifica la búsqueda de un producto existente en el stock.
     * Se espera que el producto se encuentre correctamente en el stock.
     */
    @Test
    public void testBuscarProductoExistente() {
        Stock stock = new Stock();
        Producto producto = new Producto("Latte", 6000, "CAF002", 8);
        stock.agregarProductoAStock(producto);
        Producto buscado = stock.buscarProducto("Latte");
        assertEquals(producto, buscado);
    }

    /**
     * Prueba que verifica la búsqueda de un producto no existente en el stock.
     * Se espera que la búsqueda de un producto no existente devuelva null.
     */
    @Test
    public void testBuscarProductoNoExistente() {
        Stock stock = new Stock();
        Producto producto = new Producto("Espresso", 4000, "CAF003", 15);
        stock.agregarProductoAStock(producto);
        Producto buscado = stock.buscarProducto("Mocha");
        assertNull(buscado);
    }

    /**
     * Prueba que verifica el aumento de la cantidad de un producto en el stock.
     * Se espera que la cantidad del producto se incremente correctamente.
     */
    @Test
    public void testAumentarStock() {
        Stock stock = new Stock();
        Producto producto = new Producto("Americano", 3500, "CAF004", 5);
        stock.agregarProductoAStock(producto);
        stock.aumentarStock("Americano", 10);
        assertEquals(15, producto.getCantidad());
    }

    /**
     * Prueba que verifica la reducción de la cantidad de un producto en el stock.
     * Se espera que la cantidad del producto se reduzca correctamente.
     */
    @Test
    public void testReducirStock() {
        Stock stock = new Stock();
        Producto producto = new Producto("Mocha", 7000, "CAF005", 20);
        stock.agregarProductoAStock(producto);
        stock.reducirStock("Mocha", 5);
        assertEquals(15, producto.getCantidad());
    }

    /**
     * Prueba que verifica que se lanza una excepción cuando se intenta reducir la cantidad de un producto en el stock por debajo de cero.
     * Se espera que se lance una IllegalArgumentException.
     */
    @Test
    public void testReducirStockThrowsExceptionForNegativeCantidad() {
        Stock stock = new Stock();
        Producto producto = new Producto("Latte", 6000, "CAF002", 8);
        stock.agregarProductoAStock(producto);
        assertThrows(IllegalArgumentException.class, () -> {
            stock.reducirStock("Latte", 10);
        });
    }
}
