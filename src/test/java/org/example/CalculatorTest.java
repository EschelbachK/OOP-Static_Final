package org.example;

import org.junit.jupiter.api.Test;            // JUnit‑Annotationen importieren
import static org.junit.jupiter.api.Assertions.*; // Assertions (z. B. assertEquals, assertThrows)

class CalculatorTest {

    @Test
    void add_shouldReturnSum() {
        // Eingabewerte festlegen
        int a = 8;
        int b = 5;

        // Methode aufrufen
        int result = Calculator.add(a, b);

        // Ergebnis prüfen
        assertEquals(13, result);
    }

    @Test
    void subtract_shouldReturnDifference() {
        // Eingabewerte festlegen
        int a = 10;
        int b = 4;

        // Methode aufrufen
        int result = Calculator.subtract(a, b);

        // Ergebnis prüfen
        assertEquals(6, result);
    }

    @Test
    void multiply_shouldReturnProduct() {
        // Eingabewerte festlegen
        int a = 3;
        int b = 7;

        // Methode aufrufen
        int result = Calculator.multiply(a, b);

        // Ergebnis prüfen
        assertEquals(21, result);
    }

    @Test
    void divide_shouldReturnQuotient() {
        // Eingabewerte festlegen
        double a = 20;
        double b = 4;

        // Methode aufrufen
        double result = Calculator.divide(a, b);

        // Ergebnis prüfen
        assertEquals(5.0, result);
    }

    @Test
    void divide_byZero_shouldThrowException() {
        // Division durch 0 sollte IllegalArgumentException auslösen
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(10, 0));
    }
}
