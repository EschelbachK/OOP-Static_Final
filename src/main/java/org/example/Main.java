package org.example;

public class Main {
    public static void main(String[] args) {

        // Erstes Counter-Objekt erstellen
        Counter c1 = new Counter();

        // Erhöht den Zähler für das erste Objekt
        c1.incrementInstanceCount();

        // Erhöht den gemeinsamen Zähler
        Counter.incrementTotalCount();

        // Zweites Counter-Objekt erstellen
        Counter c2 = new Counter();

        // Erhöht den Zähler für das zweite Objekt zweimal
        c2.incrementInstanceCount();
        c2.incrementInstanceCount();

        // Erhöht den gemeinsamen Zähler
        Counter.incrementTotalCount();

        // Gibt beide Counter-Objekte aus
        System.out.println(c1);
        System.out.println(c2);

        // Trenner für die Calculator-Ausgabe
        System.out.println("\n--- Calculator ---");

        // Rechenmethoden aus Calculator testen
        System.out.println("5 + 3 = " + Calculator.add(5, 3));
        System.out.println("10 - 4 = " + Calculator.subtract(10, 4));
        System.out.println("6 * 7 = " + Calculator.multiply(6, 7));
        System.out.println("20 / 4 = " + Calculator.divide(20, 4));
    }
}
