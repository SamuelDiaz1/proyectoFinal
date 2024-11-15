package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.visitor.FacturaVisitor;

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
    //Getter y setter de la nombre del producto
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    
    //Getter y setter de la nombre de la producto
    public int getPrecioVenta() {return precioVenta;}
    public void setPrecioVenta(int precioVenta) {this.precioVenta = precioVenta;}
    
    //Getter y setter de la cedula de la persona
    public String getCodigoProducto() {return codigoProducto;}
    public void setCodigoProducto(String codigoProducto) {this.codigoProducto = codigoProducto;}
    
    //Getter y setter de la cedula de la persona
    public int getCantidad() {return cantidad;}
    public void setCantidad(int cantidad) {this.cantidad = cantidad;}
    
    //Muestra la información de un producto
    public void mostrarInfoProducto() {
        System.out.println("Producto - Nombre: " + nombre + ", Precio: $" + precioVenta + ", Cantidad en stock: " + cantidad);
    }

    //Metodo para clonar un producto
    public Producto clonar(){
        return new Producto(this.nombre, this.precioVenta, this.codigoProducto, this.cantidad);
    }
     public void accept(FacturaVisitor visitor) {
        // se implementa en las subclases
    }
}
