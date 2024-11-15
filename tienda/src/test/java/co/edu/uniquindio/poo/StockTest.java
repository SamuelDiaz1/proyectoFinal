package co.edu.uniquindio.poo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;

public class StockTest {

    @Test
    public void testAgregarProductoAStock() {
        Stock stock = new Stock();
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        stock.agregarProductoAStock(producto);
        Producto buscado = stock.buscarProducto("Capuchino");
        assertEquals(producto, buscado);
    }

    @Test
    public void testBuscarProductoExistente() {
        Stock stock = new Stock();
        Producto producto = new Producto("Latte", 6000, "CAF002", 8);
        stock.agregarProductoAStock(producto);
        Producto buscado = stock.buscarProducto("Latte");
        assertEquals(producto, buscado);
    }

    @Test
    public void testBuscarProductoNoExistente() {
        Stock stock = new Stock();
        Producto producto = new Producto("Espresso", 4000, "CAF003", 15);
        stock.agregarProductoAStock(producto);
        Producto buscado = stock.buscarProducto("Mocha");
        assertNull(buscado);
    }

    @Test
    public void testAumentarStock() {
        Stock stock = new Stock();
        Producto producto = new Producto("Americano", 3500, "CAF004", 5);
        stock.agregarProductoAStock(producto);
        stock.aumentarStock("Americano", 10);
        assertEquals(15, producto.getCantidad());
    }

    @Test
    public void testReducirStock() {
        Stock stock = new Stock();
        Producto producto = new Producto("Macchiato", 4500, "CAF005", 20);
        stock.agregarProductoAStock(producto);
        stock.reducirStock("Macchiato", 5);
        assertEquals(15, producto.getCantidad());
    }

    @Test
    public void testReducirStockThrowsExceptionForInsufficientQuantity() {
        Stock stock = new Stock();
        Producto producto = new Producto("Flat White", 5500, "CAF006", 5);
        stock.agregarProductoAStock(producto);
        assertThrows(IllegalArgumentException.class, () -> {
            stock.reducirStock("Flat White", 10);
        });
    }

    @Test
    public void testMostrarInventario() {
        Stock stock = new Stock();
        Producto capuchino = new Producto("Capuchino", 5000, "CAF001", 10);
        Producto latte = new Producto("Latte", 6000, "CAF002", 8);
        stock.agregarProductoAStock(capuchino);
        stock.agregarProductoAStock(latte);
        stock.mostrarInventario(); // Esto imprimirá los detalles del inventario
    }
}
