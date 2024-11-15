package co.edu.uniquindio.poo;

public class Fruta extends Producto {
    private double peso;

     // Constructor para inicializar los atributos de la fruta
    public Fruta(String nombre, int precioVenta,  String codigoProducto, int stock, double peso) {
        super(nombre, precioVenta, codigoProducto, stock);
        this.peso = peso;
    }

    // Getter y setter para del peso de la fruta
    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}
    
    // Sobrescribe el método mostrarInfoProducto para mostrar información específica de la fruta
    @Override
    public void mostrarInfoProducto() {
        super.mostrarInfoProducto(); // Llama al método de la clase base Producto
        System.out.println("  -> Tipo: Mecato, se vence el "+peso);
    }
}
