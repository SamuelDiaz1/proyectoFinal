package co.edu.uniquindio.poo.factories;

import co.edu.uniquindio.poo.Administrador;
import co.edu.uniquindio.poo.Cajero;
import co.edu.uniquindio.poo.Empleado;

public class EmpleadoFactory implements IEmpleadoFactory {
    /**
     * Crea una instancia de Empleado según el tipo especificado.
     * @param tipo Tipo de empleado a crear (por ejemplo, "administrador" o "cajero").
     * @param nombre Nombre del empleado.
     * @param cedula Número de identificación del empleado.
     * @param edad Edad del empleado.
     * @return Una instancia de un tipo específico de Empleado.
     * @throws IllegalArgumentException si el tipo de empleado no es soportado.
     */
@Override public Empleado crearEmpleado(String tipo, String nombre, String cedula, String edad) { 
    switch (tipo.toLowerCase()) { 
        case "administrador": 
            return new Administrador(nombre, cedula, edad); // Crea un Administrador
        case "cajero": 
            return new Cajero(nombre, cedula, edad); // Crea un cajero
        default: 
            throw new IllegalArgumentException("Tipo de empleado no soportado: " + tipo); 
        } 
        
    }
}
