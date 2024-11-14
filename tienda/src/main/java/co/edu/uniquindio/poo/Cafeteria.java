package co.edu.uniquindio.poo;


import java.util.ArrayList;
import java.util.List;

import co.edu.uniquindio.poo.factories.ClienteFactory;
import co.edu.uniquindio.poo.factories.EmpleadoFactory;
import co.edu.uniquindio.poo.handlers.AdministradorHandler;
import co.edu.uniquindio.poo.handlers.CajeroDescuentoHandler;
import co.edu.uniquindio.poo.handlers.DescuentoHandler;

public class Cafeteria {
    private String nombre;
    private String nit;
    private Stock stock;
    private List<Empleado> empleados;
    private EmpleadoFactory empleadoFactory;
    private List<Cliente> clientes;
    private ClienteFactory clienteFactory;
    private DescuentoHandler descuentoHandler;
    
    public Cafeteria(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.empleados=new ArrayList<>();
        this.empleadoFactory=new EmpleadoFactory();
        this.clienteFactory=new ClienteFactory();
        configurarCadenaDeDescuento();
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
    public void agregarEmpleado(String tipo, String nombre, String cedula, String edad) {
        Empleado empleado = empleadoFactory.crearEmpleado(tipo, nombre, cedula, edad);
        empleados.add(empleado);
        System.out.println(tipo + " " + nombre + " ha sido agregado a la cafetería.");
    }
    public void agregarCliente( String nombre, String cedula, String edad, String tipoCliente) {
        Cliente cliente= clienteFactory.crearCliente( nombre, cedula, edad, tipoCliente);
        clientes.add(cliente);
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

    private void configurarCadenaDeDescuento() {
        DescuentoHandler cajeroHandler = new CajeroDescuentoHandler();
        DescuentoHandler gerenteHandler = new AdministradorHandler();
        cajeroHandler.setNextHandler(gerenteHandler);
        this.descuentoHandler = cajeroHandler;
    }
    public void agregarProductoAFactura(Factura factura, String nombreProducto, int cantidad) {
        Producto producto = stock.buscarProducto(nombreProducto);
        if (producto != null) {
            factura.agregarProductoAFactura(producto, cantidad);
        } else {
            System.out.println("Producto no encontrado en el inventario.");
        }
    }
    
    public double calcularDescuentoCliente(Cliente cliente) {
        double descuento = 0.0;
        descuento =cliente.calcularPorcentajeDescuento();
        System.out.println("Descuento calculado para " + cliente.getNombre() + ": " + descuento + "%");
        descuentoHandler.aplicarDescuento(descuento);
        return  descuento;
    }
}
