package co.edu.uniquindio.poo.visitor;

import co.edu.uniquindio.poo.Cafe;
import co.edu.uniquindio.poo.Fruta;
import co.edu.uniquindio.poo.Refrigerado;

public class DescuentoVisitor implements FacturaVisitor{
    private double descuentoTotal;

    public double getDescuentoTotal() {
        return descuentoTotal;
    }
    @Override
    public void visit(Cafe cafe) {
        double descuento = cafe.getPrecioVenta() * 0.10 * cafe.getCantidad(); // 10% descuento en café
        descuentoTotal += descuento;
        System.out.println((descuentoTotal += descuento) +"Descuento aplicado en " + cafe.getNombre() + ": $" + descuento);
    }
    @Override
    public void visit(Refrigerado refrigerado) {
        double descuento = refrigerado.getPrecioVenta() * 0.08 * refrigerado.getCantidad(); // 8% descuento en refrigerados
        descuentoTotal += descuento;
        System.out.println((descuentoTotal += descuento) + "Descuento aplicado en " + refrigerado.getNombre() + ": $" + descuento);
    }
    @Override
    public void visit(Fruta fruta) {
        double descuento = fruta.getPrecioVenta() * 0.05 * fruta.getCantidad(); // 5% descuento en fruta
        descuentoTotal += descuento;
        System.out.println((descuentoTotal += descuento) + "Descuento aplicado en " + fruta.getNombre() + ": $" + descuento);
    }

}
