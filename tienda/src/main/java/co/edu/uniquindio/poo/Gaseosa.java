package co.edu.uniquindio.poo;

public class Gaseosa extends Refrigerado implements Bebida{
    //Constructor de los atributos de la gaseosa
    public Gaseosa(String nombre, int precioVenta, String codigoProducto, int stock, String tempGuardado) {
        super(nombre, precioVenta, codigoProducto, stock,tempGuardado);
    }

    public String getDescripcion() { 
        return "Gaseosa";
    }

    @Override
    public int getPrecio(){
        return 2000;
    }
}
