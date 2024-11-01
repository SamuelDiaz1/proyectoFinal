package co.edu.uniquindio.poo;

public class Producto {
    private String nombre;
    private int precioVenta;
    private int precioCompra;
    private String codigoProducto;
    private int stock;
    public Producto(String nombre, int precioVenta, int precioCompra, String codigoProducto, int stock) {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.codigoProducto = codigoProducto;
        this.stock = stock;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
    public int getPrecioCompra() {
        return precioCompra;
    }
    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }
    public String getCodigoProducto() {
        return codigoProducto;
    }
    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
