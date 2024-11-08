package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Mecato extends Producto {
    private LocalDate fechaCaducidad;

    

    public Mecato(String nombre, int precioVenta, String codigoProducto, int stock,
            LocalDate fechaCaducidad) {
        super(nombre, precioVenta, codigoProducto, stock);
        this.fechaCaducidad = fechaCaducidad;
    }
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    @Override
    public void mostrarInfoProducto() {
        super.mostrarInfoProducto();
        System.out.println("  -> Tipo: Mecato, se vence el "+fechaCaducidad );
    }
    
}
