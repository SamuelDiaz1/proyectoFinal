package co.edu.uniquindio.poo.factories;

import co.edu.uniquindio.poo.Administrador;
import co.edu.uniquindio.poo.Cajero;
import co.edu.uniquindio.poo.Empleado;

public class EmpleadoFactory implements IEmpleadoFactory {
@Override public Empleado crearEmpleado(String tipo, String nombre, String cedula, String edad) { 
    switch (tipo.toLowerCase()) { 
        case "administrador": 
            return new Administrador(nombre, cedula, edad); 
        case "cajero": 
            return new Cajero(nombre, cedula, edad); 
        default: 
            throw new IllegalArgumentException("Tipo de empleado no soportado: " + tipo); } }
}
