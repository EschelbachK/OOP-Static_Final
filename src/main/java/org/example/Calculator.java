package org.example;

// Klasse für einfache Rechenoperationen
public class Calculator {

    // Addiert zwei ganze Zahlen
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtrahiert b von a
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multipliziert zwei ganze Zahlen
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Dividiert a durch b (wirft Fehler bei Division durch 0)
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division durch 0 ist nicht erlaubt!");
        }
        return a / b;
    }
}
