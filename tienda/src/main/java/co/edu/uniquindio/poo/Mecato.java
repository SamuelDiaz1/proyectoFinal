package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Mecato extends Producto{
    private LocalDate fechaCaducidad;

    

    public Mecato(String nombre, int precioVenta, int precioCompra, String codigoProducto, int stock,
            LocalDate fechaCaducidad) {
        super(nombre, precioVenta, precioCompra, codigoProducto, stock);
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    
}
