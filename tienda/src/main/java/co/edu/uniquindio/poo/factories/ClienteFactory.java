package co.edu.uniquindio.poo.factories;
import co.edu.uniquindio.poo.Cliente;



public class ClienteFactory implements IClienteFactory{
    @Override
    public Cliente crearCliente(String nombre, String cedula, String edad, String tipoCliente) { 
        return new Cliente(nombre,cedula,edad,tipoCliente);
    }    
}
