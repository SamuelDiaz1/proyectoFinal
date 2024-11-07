package co.edu.uniquindio.poo;

public class Producto {
    private String nombre;
    private int precioVenta;
    private String codigoProducto;
    private int cantidad;
    public Producto(String nombre, int precioVenta, String codigoProducto, int cantidad) {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.codigoProducto = codigoProducto;
        this.cantidad=cantidad;
    }
    public String getNombre() {return nombre;}
    
    public void setNombre(String nombre) {this.nombre = nombre;}
    
    public int getPrecioVenta() {return precioVenta;}
    
    public void setPrecioVenta(int precioVenta) {this.precioVenta = precioVenta;}
    
    public String getCodigoProducto() {return codigoProducto;}
    
    public void setCodigoProducto(String codigoProducto) {this.codigoProducto = codigoProducto;}
    
    public int getCantidad() {return cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}
    
    public void mostrarInfoProducto() {
        System.out.println("Producto - Nombre: " + nombre + ", Precio: $" + precioVenta + ", Cantidad en stock: " + cantidad);
    }
    
}
