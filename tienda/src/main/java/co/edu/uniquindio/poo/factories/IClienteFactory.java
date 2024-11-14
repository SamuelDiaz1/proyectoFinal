package co.edu.uniquindio.poo.factories;

import co.edu.uniquindio.poo.Cliente;

public interface IClienteFactory {
    Cliente crearCliente( String nombre, String cedula, String edad, String tipoCliente);
}
