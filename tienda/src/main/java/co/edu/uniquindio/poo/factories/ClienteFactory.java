package co.edu.uniquindio.poo.factories;
import co.edu.uniquindio.poo.Cliente;



public class ClienteFactory implements IClienteFactory{
    /**
     * @param nombre 
     * @param cedula
     * @param cedula
     * @param edad
     * @param tipoCliente
     * Método para crear un cliente
     */
    @Override
    public Cliente crearCliente(String nombre, String cedula, String edad, String tipoCliente) { 
        return new Cliente(nombre,cedula,edad,tipoCliente);
    }    
}
