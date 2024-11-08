package co.edu.uniquindio.poo.factories;

import co.edu.uniquindio.poo.Empleado;

public interface IEmpleadoFactory {
    Empleado crearEmpleado(String tipo, String nombre, String cedula, String edad);
}
