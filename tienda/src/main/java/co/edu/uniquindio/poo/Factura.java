package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

import co.edu.uniquindio.poo.visitor.DescuentoVisitor;

public class Factura {
    private String idFactura;
    private List<Producto> productos;
    // Constructor que inicializa la factura con un ID y una lista vacía de productos
    public Factura(String idFactura) {
        this.idFactura = idFactura;
        this.productos = new ArrayList<>();
    }
    // Método para obtener la lista de productos en la factura
    public List<Producto> getProductos() {return productos;}

    //Metodo get del id de la factura
    public String getIdFactura() {return idFactura;}
    
    /*
     * @param producto
     * @param cantidad
     * Método para agregar un producto específico a la factura con una cantidad determinada
     */
    public void agregarProductoAFactura(Producto producto, int cantidad) {
         // Verifica si hay suficiente cantidad en stock antes de agregar
        if (cantidad > producto.getCantidad()) {
            System.out.println("No hay suficiente cantidad de " + producto.getNombre() + " en el inventario.");
        }

        producto.setCantidad(producto.getCantidad() - cantidad);   // Reduce la cantidad del producto en el inventario

        // Crea una instancia de Producto para registrar la cantidad facturada
        Producto productoFacturado = new Producto( producto.getNombre(), producto.getPrecioVenta(),producto.getCodigoProducto(), cantidad);
        // Añade el producto a la lista de productos en la factura
        productos.add(productoFacturado);
        System.out.println("Producto agregado: " + producto.getNombre() + " x " + cantidad);
    }
    /*
     * @param descuento
     * método para aplicar un descuento usando el patron visitor
     */
    public void aplicarDescuento(DescuentoVisitor descuento) {
        // Aplica el descuento a cada producto de la factura
        for (Producto producto : productos) {
            producto.accept(descuento);
        }
        System.out.println("Descuento total en la factura: $" + descuento.getDescuentoTotal());
    }

    // Método que calcula el total de la factura sin descuentos
    public double calcularTotal() {
       double total = 0.0;  

        for (Producto producto : productos) {
            total += producto.getPrecioVenta() * producto.getCantidad();
        }
        return total;
    }

    // Método para mostrar los detalles de la factura
    public void mostrarFactura() {
        System.out.println("Factura ID: " + idFactura);
        System.out.println("Productos:");
        // Muestra cada producto de la lista con su cantidad y precio
        for (Producto producto : productos) {
            System.out.println("- " + producto.getNombre() + " x " + producto.getCantidad() + " = $" + (calcularTotal()));
        }
        System.out.println("Total: $" + calcularTotal());
    } 
}
