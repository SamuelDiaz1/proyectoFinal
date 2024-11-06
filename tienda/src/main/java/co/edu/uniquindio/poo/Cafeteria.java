package co.edu.uniquindio.poo;


import java.util.ArrayList;
import java.util.List;

public class Cafeteria {
    private String nombre;
    private String nit;
    private Stock stock;
    private List<Empleado> empleados;
    
    public Cafeteria(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.empleados=new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    
    public void agregarProductoInventario(Producto producto) {
        stock.agregarProducto(producto);
    }
 
    public List<Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    public void mostrarInventario() {
        stock.mostrarInventario();
    }

    public void aumentarStock(String nombreProducto, int cantidad) {
        stock.aumentarStock(nombreProducto, cantidad);
    }

    public void reducirStock(String nombreProducto, int cantidad) {
        stock.reducirStock(nombreProducto, cantidad);
    }

    
}
