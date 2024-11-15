package co.edu.uniquindio.poo;


import java.util.ArrayList;
import java.util.List;

import co.edu.uniquindio.poo.builder.FacturaBuilder;
import co.edu.uniquindio.poo.factories.ClienteFactory;
import co.edu.uniquindio.poo.factories.EmpleadoFactory;
import co.edu.uniquindio.poo.handlers.AdministradorHandler;
import co.edu.uniquindio.poo.handlers.CajeroDescuentoHandler;
import co.edu.uniquindio.poo.handlers.DescuentoHandler;
import co.edu.uniquindio.poo.visitor.DescuentoVisitor;

public class Cafeteria {
    private String nombre;
    private String nit;
    Stock stock;
    private List<Empleado> empleados;
    private EmpleadoFactory empleadoFactory;
    List<Cliente> clientes;
    private ClienteFactory clienteFactory;
    List<Factura> facturas;
    private DescuentoHandler descuentoHandler;
     // Constructor que inicializa los atributos de la cafetería
    public Cafeteria(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.empleados=new ArrayList<>();
        this.facturas = new ArrayList<>();
        this.empleadoFactory=new EmpleadoFactory();
        this.clienteFactory=new ClienteFactory();
        this.stock=new Stock();
        configurarCadenaDeDescuento();
    }
    // Metodos getter y setter para el nombre de la cafeteria
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    
    // Metodos getter y setter del nit de la cafeteria
    public String getNit() {return nit; }
    public void setNit(String nit) {this.nit = nit;}
    /*
     * @param producto
     * Método para agregar un producto al inventario o stock de la cafetería
     */
    public void agregarProductoInventario(Producto producto) {
        stock.agregarProductoAStock(producto);
    }

    // Métodos getter y setter para los empleados de la cafetería
    public List<Empleado> getEmpleados() {return empleados;}
    public void setEmpleados(List<Empleado> empleados) {this.empleados = empleados;}
    /*
     * @param tipo
     * @param nombre
     * @param cedula
     * @param edad
     *  Método para agregar un empleado a la cafetería usando el patrón Factory
     */
    public void agregarEmpleado(String tipo, String nombre, String cedula, String edad) {
        Empleado empleado = empleadoFactory.crearEmpleado(tipo, nombre, cedula, edad);
        empleados.add(empleado);
        System.out.println(tipo + " " + nombre + " ha sido agregado a la cafetería.");
    }
    /*
     * @param nombre 
     * @param cedula
     * @param edad
     * @param tipoCliente
     * Método para agregar un cliente a la cafetería usando el patrón Factory
     */
    public void agregarCliente( String nombre, String cedula, String edad, String tipoCliente) {
        Cliente cliente= clienteFactory.crearCliente( nombre, cedula, edad, tipoCliente);
        clientes.add(cliente);
    }

    // Método para mostrar el inventario de la cafetería
    public void mostrarInventario() {
        stock.mostrarInventario();
    }

    // Método para aumentar el stock de un producto específico
    public void aumentarStock(String nombreProducto, int cantidad) {
        stock.aumentarStock(nombreProducto, cantidad);
    }

    //Método para aplicar un descuento a una factura usando el patrón Visitor
   public void aplicarDescuentoAFactura(Factura factura, Cliente cliente) {
        double descuentoPorcentaje = calcularDescuentoCliente(cliente);
        DescuentoVisitor descuentoVisitor = new DescuentoVisitor(descuentoPorcentaje);
         // Aplica el descuento a cada producto de la factura utilizando el patrón Visitor
        for (Producto producto : factura.getProductos()) {
            producto.accept(descuentoVisitor);
        }
        System.out.println("Descuento total aplicado a la factura: $" + descuentoVisitor.getDescuentoTotal());
    }

    /*
     * @param nombreProducto
     * @param cantidad
     * Método para reducir el stock de un producto específico
     */
    public void reducirStock(String nombreProducto, int cantidad) {
        stock.reducirStock(nombreProducto, cantidad);
    }

    /*
     * @param idFactura
     * Método para crear una nueva factura utilizando el patrón Builder
     * @return nuevaFactura
     */
    public Factura crearFactura(String idFactura) {
        FacturaBuilder facturaBuilder = new FacturaBuilder(); // Crea un nuevo Builder para la factura
        Factura nuevaFactura = facturaBuilder.setIdFactura(idFactura).build(); // Construye la factura con el id proporcionado
        facturas.add(nuevaFactura); // Agrega la nueva factura a la lista de facturas
        return nuevaFactura;
    }

    // Configura el chain of responsibility para los descuentos
    private void configurarCadenaDeDescuento() {
        DescuentoHandler cajeroHandler = new CajeroDescuentoHandler();// Crea el manejador de descuentos para el cajero
        DescuentoHandler adminHandler = new AdministradorHandler();// Crea el manejador de descuentos para el administrador
        cajeroHandler.setNextHandler(adminHandler);// Configura el flujo de la cadena de responsabilidad
        this.descuentoHandler = cajeroHandler;// Establece el primer manejador en la cadena
    }

    /*
     * @param factura
     * @param nombreProducto
     * @param cantidad
     * Método para agregar un producto a una factura específica
     */
    public void agregarProductoAFactura(Factura factura, String nombreProducto, int cantidad) {
        Producto producto = stock.buscarProducto(nombreProducto);// Busca el producto en el inventario
        if (producto != null) {
            factura.agregarProductoAFactura(producto, cantidad);// Si se encuentra, se agrega a la factura
        } else {
            System.out.println("Producto no encontrado en el inventario."); 
        }
    }
    
    /*
     * @param cliente
     * Método para calcular el descuento de un cliente específico
     * @return descuento
     */
    public double calcularDescuentoCliente(Cliente cliente) {
        double descuento = 0.0;
        descuento =cliente.calcularPorcentajeDescuento();// Calcula el descuento con el método del cliente
        System.out.println("Descuento calculado para " + cliente.getNombre() + ": " + descuento + "%");
        descuentoHandler.aplicarDescuento(descuento); // Aplica el descuento utilizando el chain of responsibility
        return  descuento;
    }
}
