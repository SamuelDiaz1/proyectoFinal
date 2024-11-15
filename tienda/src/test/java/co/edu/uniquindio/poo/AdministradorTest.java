package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AdministradorTest {

    @Test
    public void testCalcularSalario() {
        Administrador administrador = new Administrador("Pedro", "123456789", "45");
        int salario = administrador.calcularSalario(2000, 500);
        assertEquals(2500, salario);
        
    }

    /**
     * Prueba que verifica el cálculo del salario sin bonificación.
     * Se espera que el salario calculado sea igual al salario base cuando no hay bonificación.
     */
    @Test
    public void testCalcularSalarioSinBonificacion() {
        Administrador administrador = new Administrador("Maria", "987654321", "40");
        int salario = administrador.calcularSalario(3000, 0);
        assertEquals(3000, salario);
    }
    

    /**
     * Prueba que verifica que se lanza una excepción cuando el salario base es negativo.
     * Se espera que se lance una IllegalArgumentException.
     */
    @Test
    public void testCalcularSalarioThrowsExceptionForNegativeSalarioBase() {
        Administrador administrador = new Administrador("Luis", "1122334455", "50");
        assertThrows(IllegalArgumentException.class, () -> {
            administrador.calcularSalario(-1000, 500);
        });
    }

    /**
     * Prueba que verifica que se lanza una excepción cuando la bonificación es negativa.
     * Se espera que se lance una IllegalArgumentException.
     */
    @Test
    public void testCalcularSalarioThrowsExceptionForNegativeBonificacion() {
        Administrador administrador = new Administrador("Ana", "5566778899", "38");
        assertThrows(IllegalArgumentException.class, () -> {
            administrador.calcularSalario(2000, -200);
            
        });
    }
}