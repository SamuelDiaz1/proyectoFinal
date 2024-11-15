package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CafeteriaTest {
    @Test
    public void testGetNombre() {
        Cafeteria cafeteria = new Cafeteria("Café Central", "12345");
        assertEquals("Café Central", cafeteria.getNombre());

    }

    /**
     * Prueba que verifica el cambio de nombre de la cafetería.
     * Se espera que el nombre de la cafetería se actualice correctamente.
     */
    @Test
    public void testSetNombre() {
        Cafeteria cafeteria = new Cafeteria("Café Central", "12345");
        cafeteria.setNombre("Café de la Esquina");
        assertEquals("Café de la Esquina", cafeteria.getNombre());
    }

    /**
     * Prueba que verifica la obtención del NIT de la cafetería.
     * Se espera que el NIT de la cafetería se obtenga correctamente.
     */
    @Test
    public void testGetNit() {
        Cafeteria cafeteria = new Cafeteria("Café Central", "12345");
        assertEquals("12345", cafeteria.getNit());
    }

    /**
     * Prueba que verifica el cambio de NIT de la cafetería.
     * Se espera que el NIT de la cafetería se actualice correctamente.
     */
    @Test
    public void testSetNit() {
        Cafeteria cafeteria = new Cafeteria("Café Central", "12345");
        cafeteria.setNit("67890");
        assertEquals("67890", cafeteria.getNit());
    }

    /**
     * Prueba que verifica la adición de un producto al inventario de la cafetería.
     * Se espera que el producto se agregue correctamente al inventario.
     */
    @Test
    public void testAgregarProductoInventario() {
        Cafeteria cafeteria = new Cafeteria("Café Central", "12345");
        Producto producto = new Producto("Capuchino", 5000, "CAF001", 10);
        cafeteria.agregarProductoInventario(producto);
        assertTrue(cafeteria.stock.buscarProducto("Capuchino") != null);
    }

    /**
     * Prueba que verifica la adición de un empleado a la cafetería.
     * Se espera que el empleado se agregue correctamente a la lista de empleados.
     */
    @Test
    public void testAgregarEmpleado() {
        Cafeteria cafeteria = new Cafeteria("Café Central", "12345");
        cafeteria.agregarEmpleado("Barista", "Juan Pérez", "123456789", "30");
        assertEquals(1, cafeteria.getEmpleados().size());
    }

    /**
     * Prueba que verifica la adición de un cliente a la cafetería.
     * Se espera que el cliente se agregue correctamente a la lista de clientes.
     */
    @Test
    public void testAgregarCliente() {
        Cafeteria cafeteria = new Cafeteria("Café Central", "12345");
        cafeteria.agregarCliente("Ana Gómez", "987654321", "25", "Frecuente");
        assertEquals(1, cafeteria.clientes.size());
    }

    /**
     * Prueba que verifica la creación de una factura en la cafetería.
     * Se espera que la factura se cree correctamente.
     */
    @Test
    public void testCrearFactura() {
        Cafeteria cafeteria = new Cafeteria("Café Central", "12345");
        Factura factura = cafeteria.crearFactura("FAC001");
        assertEquals("FAC001", factura.getIdFactura());
        assertTrue(cafeteria.facturas.contains(factura));
    }

    @Test
    public void testAgregarEmpleadoThrowsException() {
        Cafeteria cafeteria = new Cafeteria("Café Central", "12345");
        assertThrows(IllegalArgumentException.class, () -> {
            cafeteria.agregarEmpleado(null, "Juan Pérez", "123456789", "30");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            cafeteria.agregarEmpleado("Barista", null, "123456789", "30");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            cafeteria.agregarEmpleado("Barista", "Juan Pérez", null, "30");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            cafeteria.agregarEmpleado("Barista", "Juan Pérez", "123456789", null);
        });
    }

    @Test
    public void testAgregarProductoAFacturaThrowsException() {
        Cafeteria cafeteria = new Cafeteria("Café Central", "12345");
        Factura factura = new Factura("FAC001");
        assertThrows(IllegalArgumentException.class, () -> {
            cafeteria.agregarProductoAFactura(null, "Capuchino", 1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            cafeteria.agregarProductoAFactura(factura, null, 1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            cafeteria.agregarProductoAFactura(factura, "Capuchino", 0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            cafeteria.agregarProductoAFactura(factura, "Capuchino", -1);
        });
    }

}
