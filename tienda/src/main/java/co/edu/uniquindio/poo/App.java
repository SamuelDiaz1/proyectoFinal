package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.factories.ClienteFactory;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Cafeteria cafeteria = new Cafeteria("Rapitienda","12345");

        // Crear productos
        Producto cafe = new Cafe("Café Espresso", 3000, "CAF001", 10);
        Producto fruta = new Fruta("Manzana", 1000, "FRU001", 5,2.0);
        ClienteFactory cliente=new ClienteFactory();
        // Agregar productos al stock
        cafeteria.agregarProductoInventario(cafe);
        cafeteria.agregarProductoInventario(fruta);

        // Crear cliente de tipo VIP
        Cliente clienteVIP =cliente.crearCliente( "Juan", "123456", "35","VIP");

        // Crear una factura
        Factura factura = cafeteria.crearFactura("F-001");
        factura.agregarProductoAFactura(fruta, 2);
        // Agregar productos a la factura
        cafeteria.agregarProductoAFactura(factura, "Café Espresso", 2);
        cafeteria.agregarProductoAFactura(factura, "Manzana", 3);

        // Aplicar descuento al cliente
        cafeteria.aplicarDescuentoAFactura(factura, clienteVIP);

        // Mostrar factura
        factura.mostrarFactura();
        cafeteria.mostrarInventario();
    }
}
