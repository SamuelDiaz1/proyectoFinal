package co.edu.uniquindio.poo.visitor;

import co.edu.uniquindio.poo.Cafe;
import co.edu.uniquindio.poo.Fruta;
import co.edu.uniquindio.poo.Refrigerado;

public class DescuentoVisitor implements FacturaVisitor{
    private double descuentoTotal;
    
    /**
     * Constructor de DescuentoVisitor que inicializa el descuento total.
     *
     * @param descuentoTotal Inicializa el descuento total aplicado en la factura.
     */
    public DescuentoVisitor(double descuentoTotal) {
        this.descuentoTotal = descuentoTotal;
    }

    //Metodo get para descuento
    public double getDescuentoTotal() {
        return descuentoTotal;
    }

    /**
     * Aplica un descuento específico al producto de tipo Cafe.
     * Calcula el 10% del precio total del café (precio por cantidad) y lo suma al descuento total.
     * @param cafe El producto de tipo Cafe a procesar.
     */
    @Override
    public void visit(Cafe cafe) {
        double descuento = cafe.getPrecioVenta() * 0.10 * cafe.getCantidad(); // 10% descuento en café
        descuentoTotal += descuento;
        System.out.println((descuentoTotal += descuento) +"Descuento aplicado en " + cafe.getNombre() + ": $" + descuento);
    }

    /**
     * Aplica un descuento específico al producto de tipo Refrigerado.
     * Calcula el 8% del precio total del refrigerado (precio por cantidad) y lo suma al descuento total.
     *
     * @param refrigerado El producto de tipo Refrigerado a procesar.
     */
    @Override
    public void visit(Refrigerado refrigerado) {
        double descuento = refrigerado.getPrecioVenta() * 0.08 * refrigerado.getCantidad(); // 8% descuento en refrigerados
        descuentoTotal += descuento;
        System.out.println((descuentoTotal += descuento) + "Descuento aplicado en " + refrigerado.getNombre() + ": $" + descuento);
    }

        /**
     * Aplica un descuento específico al producto de tipo Fruta.
     * Calcula el 5% del precio total de la fruta (precio por cantidad) y lo suma al descuento total.
     *
     * @param fruta El producto de tipo Fruta a procesar.
     */
    @Override
    public void visit(Fruta fruta) {
        double descuento = fruta.getPrecioVenta() * 0.05 * fruta.getCantidad(); // 5% descuento en fruta
        descuentoTotal += descuento;
        System.out.println((descuentoTotal += descuento) + "Descuento aplicado en " + fruta.getNombre() + ": $" + descuento);
    }

    

}
