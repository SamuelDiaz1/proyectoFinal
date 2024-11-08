package co.edu.uniquindio.poo;

public class Fruta extends Producto {
    private double peso;

    public Fruta(String nombre, int precioVenta,  String codigoProducto, int stock, double peso) {
        super(nombre, precioVenta, codigoProducto, stock);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public void mostrarInfoProducto() {
        super.mostrarInfoProducto();
        System.out.println("  -> Tipo: Mecato, se vence el "+peso);
    }
}
