package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.visitor.FacturaVisitor;

public class Cafe extends Producto implements Bebida {
     // Constructor que recibe los parámetros para inicializar un objeto de tipo Cafe
    public Cafe(String nombre, int precioVenta, String codigoProducto, int stock) {
            super(nombre, precioVenta, codigoProducto, stock);
    }
    // Método que devuelve una descripción del producto específico (en este caso, "Café")
    public String getDescripcion() { 
        return "Café"; 
    }

    /*
    @param visitor
    Método que permite la visita del objeto Cafe por parte del visitante (Patrón Visitor)
    */ 
    @Override
    public void accept(FacturaVisitor visitor) {
        visitor.visit(this);// Llama al método visit del visitor, pasando este objeto Cafe
    }

    @Override
    public int getPrecio(){
        return 1500;
    }


}
