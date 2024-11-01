package co.edu.uniquindio.poo;

public class Fruta extends Producto {
    private double peso;

    public Fruta(String nombre, int precioVenta, int precioCompra, String codigoProducto, int stock, double peso) {
        super(nombre, precioVenta, precioCompra, codigoProducto, stock);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
