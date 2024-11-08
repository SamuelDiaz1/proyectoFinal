package co.edu.uniquindio.poo.factories;

import co.edu.uniquindio.poo.Cliente;
import co.edu.uniquindio.poo.Estudiante;
import co.edu.uniquindio.poo.Profesor;
import co.edu.uniquindio.poo.TipoProfesor;

public class ClienteFactory implements IClienteFactory{

    public Cliente crearCliente(String tipo, String nombre, String cedula, String edad, double parametro) { 
        switch (tipo.toLowerCase()) { 
            case "estudiante": 
                return new Estudiante(nombre, cedula, edad, parametro); 
            case "profesor": 
                return new Profesor(nombre, cedula, edad, TipoProfesor.values()[(int)parametro]);
            default: 
                throw new IllegalArgumentException("Tipo de cliente no soportado: " + tipo); 
        }
    }
}
