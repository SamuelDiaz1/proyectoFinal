package co.edu.uniquindio.poo;

public class Cliente extends Persona {
    private String tipoCliente; // Ejemplo: "regular", "VIP"

    public Cliente(String nombre, String cedula, String edad, String tipoCliente) {
        super(nombre, cedula, edad);
        this.tipoCliente = tipoCliente.toLowerCase();
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    // Método para calcular el porcentaje de descuento de un cliente general
    public double calcularPorcentajeDescuento() {
        switch (tipoCliente.toLowerCase()) {
            case "vip":
                return 0.15; // Ejemplo de descuento para clientes VIP
            case "regular":
                return 0.05; // Ejemplo de descuento para clientes regulares
            default:
                return 0.0; // Sin descuento para otros tipos
        }
    }
}
