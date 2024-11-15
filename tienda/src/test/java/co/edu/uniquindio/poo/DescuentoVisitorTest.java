package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.visitor.DescuentoVisitor;

public class DescuentoVisitorTest {

    /**
     * Prueba que verifica que se lanza una excepción cuando se aplica un descuento inválido a un café.
     * Se espera que se lance una IllegalArgumentException.
     */
    @Test
    public void testVisitCafeThrowsException() {
        Cafe cafe = new Cafe("Café Colombiano", 100, "CAF123", 10);
        DescuentoVisitor visitor = new DescuentoVisitor(0);
        assertThrows(IllegalArgumentException.class, () -> {
            visitor.visit(cafe);
        });
    }

    /**
     * Prueba que verifica la aplicación de un descuento a un café.
     * Se espera que el descuento total sea igual al precio del café.
     */
    @Test
    public void testVisitCafe() {
        Cafe cafe = new Cafe("Café Colombiano", 100, "CAF123", 10);
        DescuentoVisitor visitor = new DescuentoVisitor(0);
        visitor.visit(cafe);
        assertEquals(100.0, visitor.getDescuentoTotal(), 0.01);
    }

    /**
     * Prueba que verifica la aplicación de un descuento a un producto refrigerado.
     * Se espera que el descuento total sea igual al precio del producto refrigerado.
     */
    @Test
    public void testVisitRefrigerado() {
        Refrigerado refrigerado = new Refrigerado("Leche", 50, "REF456", 20, null);
        DescuentoVisitor visitor = new DescuentoVisitor(0);
        visitor.visit(refrigerado);
        assertEquals(80.0, visitor.getDescuentoTotal(), 0.01);
    }

    /**
     * Prueba que verifica la aplicación de un descuento a una fruta.
     * Se espera que el descuento total sea igual al precio de la fruta.
     */
    @Test
    public void testVisitFruta() {
        Fruta fruta = new Fruta("Manzana", 30, "FRU789", 15, 0);
        DescuentoVisitor visitor = new DescuentoVisitor(0);
        visitor.visit(fruta);
        assertEquals(22.5, visitor.getDescuentoTotal(), 0.01);
    }

    /**
     * Prueba que verifica la aplicación de un descuento a un producto refrigerado.
     * Se espera que el descuento total sea igual al precio del producto refrigerado.
     */
    @Test
    public void testVisitRefrigerado1() {
        Refrigerado refrigerado = new Refrigerado("Leche", 50, "REF456", 20, null);
        DescuentoVisitor visitor = new DescuentoVisitor(0);
        visitor.visit(refrigerado);
        assertEquals(80.0, visitor.getDescuentoTotal(), 0.01);
    }

    /**
     * Prueba que verifica la aplicación de un descuento a una fruta.
     * Se espera que el descuento total sea igual al precio de la fruta.
     */
    @Test
    public void testVisitFruta1() {
        Fruta fruta = new Fruta("Manzana", 30, "FRU789", 15, 0);
        DescuentoVisitor visitor = new DescuentoVisitor(0);
        visitor.visit(fruta);
        assertEquals(22.5, visitor.getDescuentoTotal(), 0.01);
    }

    /**
     * Prueba que verifica el cálculo del descuento total después de visitar varios productos.
     * Se espera que el descuento total sea la suma de los descuentos aplicados a cada producto.
     */
    @Test
    public void testGetDescuentoTotal() {
        Cafe cafe = new Cafe("Café Colombiano", 100, "CAF123", 10);
        Refrigerado refrigerado = new Refrigerado("Leche", 50, "REF456", 20, null);
        Fruta fruta = new Fruta("Manzana", 30, "FRU789", 15, 0);
        DescuentoVisitor visitor = new DescuentoVisitor(0);
        visitor.visit(cafe);
        visitor.visit(refrigerado);
        visitor.visit(fruta);
        assertEquals(202.5, visitor.getDescuentoTotal(), 0.01); // 100 + 80 + 22.5 = 202.5
    }
}
