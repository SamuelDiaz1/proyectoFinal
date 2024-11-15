package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.visitor.DescuentoVisitor;

public class DescuentoVisitorTest {

    @Test
    public void testVisitCafeThrowsException() {
        Cafe cafe = new Cafe("Café Colombiano", 100, "CAF123", 10);
        DescuentoVisitor visitor = new DescuentoVisitor(0);
        assertThrows(IllegalArgumentException.class, () -> {
            visitor.visit(cafe);
        });

    }

    @Test
    public void testVisitCafe() {
        Cafe cafe = new Cafe("Café Colombiano", 100, "CAF123", 10);
        DescuentoVisitor visitor = new DescuentoVisitor(0);
        visitor.visit(cafe);
        assertEquals(100.0, visitor.getDescuentoTotal(), 0.01);
    }

    @Test
    public void testVisitRefrigerado() {
        Refrigerado refrigerado = new Refrigerado("Leche", 50, "REF456", 20, null);
        DescuentoVisitor visitor = new DescuentoVisitor(0);
        visitor.visit(refrigerado);
        assertEquals(80.0, visitor.getDescuentoTotal(), 0.01);
    }

    @Test
    public void testVisitFruta() {
        Fruta fruta = new Fruta("Manzana", 30, "FRU789", 15, 0);
        DescuentoVisitor visitor = new DescuentoVisitor(0);
        visitor.visit(fruta);
        assertEquals(22.5, visitor.getDescuentoTotal(), 0.01);
    }

    @Test
    public void testGetDescuentoTotal1() {
        Cafe cafe = new Cafe("Café Colombiano", 100, "CAF123", 10);
        Refrigerado refrigerado = new Refrigerado("Leche", 50, "REF456", 20, null);
        Fruta fruta = new Fruta("Manzana", 30, "FRU789", 15, 0);
        DescuentoVisitor visitor = new DescuentoVisitor(0);
        visitor.visit(cafe);
        visitor.visit(refrigerado);
        visitor.visit(fruta);
        assertEquals(202.5, visitor.getDescuentoTotal(), 0.01);
    }

    @Test
    public void testVisitRefrigeradoThrowsException() {
        Refrigerado refrigerado = new Refrigerado("Leche", 50, "REF456", 20, null);
        DescuentoVisitor visitor = new DescuentoVisitor(0);
        assertThrows(IllegalArgumentException.class, () -> {
            visitor.visit((Refrigerado) null);
        });
    }

    @Test
    public void testVisitFrutaThrowsException() {
        Fruta fruta = new Fruta("Manzana", 30, "FRU789", 15, 0);
        DescuentoVisitor visitor = new DescuentoVisitor(0);
        assertThrows(IllegalArgumentException.class, () -> {
            visitor.visit((Fruta) null);
        });
    }

    @Test
    public void testVisitCafe1() {
        Cafe cafe = new Cafe("Café Colombiano", 100, "CAF123", 10);
        DescuentoVisitor visitor = new DescuentoVisitor(0);
        visitor.visit(cafe);
        assertEquals(100.0, visitor.getDescuentoTotal(), 0.01);
    }

    @Test
    public void testVisitRefrigerado1() {
        Refrigerado refrigerado = new Refrigerado("Leche", 50, "REF456", 20, null);
        DescuentoVisitor visitor = new DescuentoVisitor(0);
        visitor.visit(refrigerado);
        assertEquals(80.0, visitor.getDescuentoTotal(), 0.01);
    }

    @Test
    public void testVisitFruta1() {
        Fruta fruta = new Fruta("Manzana", 30, "FRU789", 15, 0);
        DescuentoVisitor visitor = new DescuentoVisitor(0);
        visitor.visit(fruta);
        assertEquals(22.5, visitor.getDescuentoTotal(), 0.01);
    }

    @Test
    public void testGetDescuentoTotal() {
        Cafe cafe = new Cafe("Café Colombiano", 100, "CAF123", 10);
        Refrigerado refrigerado = new Refrigerado("Leche", 50, "REF456", 20, null);
        Fruta fruta = new Fruta("Manzana", 30, "FRU789", 15, 0);
        DescuentoVisitor visitor = new DescuentoVisitor(0);
        visitor.visit(cafe);
        visitor.visit(refrigerado);
        visitor.visit(fruta);
        assertEquals(202.5, visitor.getDescuentoTotal(), 0.01);
    }// 100 + 80 + 22.5 = 202.5

}
