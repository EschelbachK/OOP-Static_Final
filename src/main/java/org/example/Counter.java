package org.example;

public class Counter {

    // Zählt, wie oft insgesamt gezählt wurde (für alle Objekte gemeinsam)
    private static int totalCount = 0;

    // Zählt, wie oft bei diesem einen Objekt gezählt wurde
    private int instanceCount = 0;

    // Erhöht den gemeinsamen Zähler (statisch, für alle Objekte)
    public static void incrementTotalCount() {
        totalCount++;
    }

    // Erhöht den Zähler für dieses eine Objekt
    public void incrementInstanceCount() {
        instanceCount++;
    }

    // Gibt beide Zähler als Text zurück
    @Override
    public String toString() {
        return "TotalCount (static): " + totalCount + ", InstanceCount: " + instanceCount;
    }
}
