package co.edu.uniquindio.poo;

public class Cliente extends Persona {
    private String tipoCliente; // Ejemplo: "regular", "VIP"
    // Constructor que inicializa los datos del cliente y define su tipo
    public Cliente(String nombre, String cedula, String edad, String tipoCliente) {
        super(nombre, cedula, edad);
        this.tipoCliente = tipoCliente.toLowerCase();
    }
    //Metodo get del tipo de cliente
    public String getTipoCliente() {
        return tipoCliente;
    }

    // Método que calcula el porcentaje de descuento del cliente según su tipo
    public double calcularPorcentajeDescuento() {
        switch (tipoCliente) {
            case "vip":
                return 0.15; // Descuento del 15% para clientes VIP
            case "regular":
                return 0.05; // Descuento del 5% para clientes regulares
            default:
                return 0.0; // Sin descuento para otros tipos de clientes
        }
    }
}
