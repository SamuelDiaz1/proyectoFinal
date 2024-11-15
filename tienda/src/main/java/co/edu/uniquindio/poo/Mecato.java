package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Mecato extends Producto {
    private LocalDate fechaCaducidad;

    //Constructor de la clase mecato e inicialización de sus atributos
    public Mecato(String nombre, int precioVenta, String codigoProducto, int stock,
            LocalDate fechaCaducidad) {
        super(nombre, precioVenta, codigoProducto, stock);
        this.fechaCaducidad = fechaCaducidad;
    }

    //Getter y setter del la fecha de caducidad
    public LocalDate getFechaCaducidad() {return fechaCaducidad;}
    public void setFechaCaducidad(LocalDate fechaCaducidad) {this.fechaCaducidad = fechaCaducidad;}
    
    //Sobreescribe el metodo y muestra la información del mecato
    @Override
    public void mostrarInfoProducto() {
        super.mostrarInfoProducto();
        System.out.println("  -> Tipo: Mecato, se vence el "+fechaCaducidad );
    }
    
}
