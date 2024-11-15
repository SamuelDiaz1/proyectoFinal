package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Stock {

    private LinkedList<Producto> inventario;

    public Stock() {
        this.inventario = new LinkedList<>();
    }

    // Método para agregar un producto al inventario
    public void agregarProductoAStock(Producto producto) {
        inventario.add(producto);
    }

    // Método para buscar un producto por nombre
    public Producto buscarProducto(String nombreProducto) {
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                return producto;
            }
        }
        System.out.println("Producto " + nombreProducto + " no encontrado en el inventario.");
        return null;
    }

    // Método para aumentar la cantidad de un producto en el inventario
    public void aumentarStock(String nombreProducto, int cantidad) {
        Producto producto = buscarProducto(nombreProducto);
        if (producto != null) {
            producto.setCantidad(producto.getCantidad() + cantidad);
            System.out.println("Aumentada cantidad de " + nombreProducto + " en " + cantidad + " unidades.");
        }
    }

    // Método para mostrar todo el inventario
    public void mostrarInventario() {
        System.out.println("Inventario actual:");
        for (Producto producto : inventario) {
            producto.mostrarInfoProducto();
        }
    }

    // Método para reducir la cantidad de un producto en el inventario
    public void reducirStock(String nombreProducto, int cantidad) {
        Producto producto = buscarProducto(nombreProducto);
        if (producto != null) {
            int nuevaCantidad = producto.getCantidad() - cantidad;
            if (nuevaCantidad >= 0) {
                producto.setCantidad(nuevaCantidad);
                System.out.println("Reducida cantidad de " + nombreProducto + " en " + cantidad + " unidades.");
            } else {
                throw new IllegalArgumentException(
                        "No hay suficiente cantidad de " + nombreProducto + " para reducir.");
            }
        }
    }

}
