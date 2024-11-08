package co.edu.uniquindio.poo.builder;

import co.edu.uniquindio.poo.Factura;

public class FacturaBuilder {
    String idFactura;

    public Factura build() {
        return new Factura(this.idFactura);
    }

    public FacturaBuilder setIdFactura(String idFactura) {
        this.idFactura = idFactura;
        return this;
    }

    
}
