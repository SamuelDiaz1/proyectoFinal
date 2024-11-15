package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CajeroTest {

    

    @Test
    public void testCalcularSalario() {
        Cajero cajero = new Cajero("Juan Pérez", "123456789", "30");
        int salario = cajero.calcularSalario(1000, 20);

        // Salario base 1000 con 20% horas extra assertEquals(1200, salario); // 1000 +
        // 20% de 1000 = 1200
    }

    @Test
    public void testCalcularSalarioSinHorasExtra() {
        Cajero cajero = new Cajero("Ana Gómez", "987654321", "25");
        int salario = cajero.calcularSalario(1500, 0);
        // Salario base 1500 sin horas extra assertEquals(1500, salario); // 1500 + 0%
        // de 1500 = 1500
    }

    /**
     * Prueba que verifica el cálculo del salario con horas extra.
     * Se espera que el salario calculado sea correcto cuando se incluyen horas extra.
     * Salario base 2000 con 50% horas extra, se espera 3000 (2000 + 50% de 2000 = 3000).
     */
    @Test
    public void testCalcularSalarioConHorasExtra() {
        Cajero cajero = new Cajero("Juan Pérez", "123456789", "30");
        int salario = cajero.calcularSalario(2000, 50);
        assertEquals(3000, salario);
    }

    /**
     * Prueba que verifica que se lanza una excepción cuando el salario base es negativo.
     * Se espera que se lance una IllegalArgumentException.
     */
    @Test
    public void testCalcularSalarioThrowsExceptionForNegativeSalarioBase() {
        Cajero cajero = new Cajero("María López", "9988776655", "35");
        assertThrows(IllegalArgumentException.class, () -> {
            cajero.calcularSalario(-1000, 20);
        });
    }

    /**
     * Prueba que verifica que se lanza una excepción cuando las horas extra son negativas.
     * Se espera que se lance una IllegalArgumentException.
     */
    @Test
    public void testCalcularSalarioThrowsExceptionForNegativeHorasExtra() {
        Cajero cajero = new Cajero("Luis Martínez", "5566778899", "28");
        assertThrows(IllegalArgumentException.class, () -> {
            cajero.calcularSalario(1000, -20);
        });
    }
}
