package org.example;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void incrementTotalCount_shouldIncreaseStaticCounter() throws Exception {
        // totalCount‑Feld via Reflection holen
        Field totalField = Counter.class.getDeclaredField("totalCount");
        // Zugriff erlauben
        totalField.setAccessible(true);
        // aktuellen Wert lesen
        int before = totalField.getInt(null);

        // Methode ausführen
        Counter.incrementTotalCount();

        // neuen Wert lesen
        int after = totalField.getInt(null);
        // Erwartung prüfen
        assertEquals(before + 1, after);
    }

    @Test
    void incrementInstanceCount_shouldIncreaseInstanceCounter() throws Exception {
        // neues Counter‑Objekt erstellen
        Counter counter = new Counter();

        // instanceCount‑Feld via Reflection holen
        Field instanceField = Counter.class.getDeclaredField("instanceCount");
        // Zugriff erlauben
        instanceField.setAccessible(true);
        // aktuellen Wert lesen
        int before = instanceField.getInt(counter);

        // Methode ausführen
        counter.incrementInstanceCount();

        // neuen Wert lesen
        int after = instanceField.getInt(counter);
        // Erwartung prüfen
        assertEquals(before + 1, after);
    }

    @Test
    void toString_shouldReturnFormattedCounts() throws Exception {
        // neues Counter‑Objekt erstellen
        Counter counter = new Counter();

        // totalCount einmal erhöhen
        Counter.incrementTotalCount();
        // instanceCount einmal erhöhen
        counter.incrementInstanceCount();

        // totalCount‑Wert via Reflection holen
        Field totalField = Counter.class.getDeclaredField("totalCount");
        totalField.setAccessible(true);
        int total = totalField.getInt(null);

        // instanceCount‑Wert via Reflection holen
        Field instanceField = Counter.class.getDeclaredField("instanceCount");
        instanceField.setAccessible(true);
        int instance = instanceField.getInt(counter);

        // erwarteten String bauen
        String expected = "TotalCount (static): " + total + ", InstanceCount: " + instance;
        // tatsächlichen String holen
        String actual = counter.toString();
        // Gleichheit prüfen
        assertEquals(expected, actual);
    }
}
