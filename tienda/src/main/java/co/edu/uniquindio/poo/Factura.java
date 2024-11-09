package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private String idFactura;
    private List<Producto> productos;

    public Factura(String idFactura) {
        this.idFactura = idFactura;
        this.productos = new ArrayList<>();
    
    }
    public String getIdFactura() {
        return idFactura;
    }
    public void agregarProductoAFactura(Producto producto, int cantidad) {
        if (cantidad > producto.getCantidad()) {
            System.out.println("No hay suficiente cantidad de " + producto.getNombre() + " en el inventario.");
        }

        producto.setCantidad(producto.getCantidad() - cantidad);  // Reducir cantidad en stock
        Producto productoFacturado = new Producto( producto.getNombre(), producto.getPrecioVenta(),producto.getCodigoProducto(), cantidad);
        productos.add(productoFacturado);
        System.out.println("Producto agregado: " + producto.getNombre() + " x " + cantidad);
    }

    public double calcularTotal() {
       double total = 0.0;  
        for (Producto producto : productos) {
            total += producto.getPrecioVenta() * producto.getCantidad();
        }
        return total;
    }
    public void mostrarFactura() {
        System.out.println("Factura ID: " + idFactura);
        System.out.println("Productos:");
        for (Producto producto : productos) {
            System.out.println("- " + producto.getNombre() + " x " + producto.getCantidad() + " = $" + (calcularTotal()));
        }
        System.out.println("Total: $" + calcularTotal());
    } 
}
