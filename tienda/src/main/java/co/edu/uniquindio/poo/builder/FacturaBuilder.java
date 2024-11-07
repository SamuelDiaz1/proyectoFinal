package co.edu.uniquindio.poo.builder;

import co.edu.uniquindio.poo.Factura;
import co.edu.uniquindio.poo.Producto;

public class FacturaBuilder {
    private Factura factura;

    public FacturaBuilder(String idFactura) {
        factura = new Factura(idFactura);
    }

    public FacturaBuilder agregarProducto(Producto producto, int cantidad) {
        factura.agregarProducto(producto, cantidad);
        return this;
    }

    public Factura build() {
        return factura;
    }
}
