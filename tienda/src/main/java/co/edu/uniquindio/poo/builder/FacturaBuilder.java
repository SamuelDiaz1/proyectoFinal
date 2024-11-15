package co.edu.uniquindio.poo.builder;

import co.edu.uniquindio.poo.Factura;
// Clase FacturaBuilder que implementa el patrón de diseño Builder para construir instancias de Factura.
public class FacturaBuilder {
    String idFactura;

    /**
     * Método para construir una instancia de Factura usando los atributos establecidos en FacturaBuilder.
     * @return Una nueva instancia de Factura con los valores proporcionados.
     */
    public Factura build() {
        return new Factura(this.idFactura);
    }

    /**
     * Establece el identificador único para la factura.
     * @param idFactura El identificador de la factura.
     * @return La instancia actual de FacturaBuilder, lo que permite el encadenamiento de métodos.
     */
    public FacturaBuilder setIdFactura(String idFactura) {
        this.idFactura = idFactura;
        return this;
    }

}
