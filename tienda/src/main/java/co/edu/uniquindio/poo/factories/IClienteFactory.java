package co.edu.uniquindio.poo.factories;

import co.edu.uniquindio.poo.Cliente;

public interface IClienteFactory {
    Cliente crearCliente(String tipo, String nombre, String cedula, String edad, double parametro);
}
