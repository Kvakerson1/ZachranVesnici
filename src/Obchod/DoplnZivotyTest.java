package Obchod;

import org.junit.jupiter.api.Test;
import predmetyainterakce.Hrac;

import static org.junit.jupiter.api.Assertions.*;

class DoplnZivotyTest {
    DoplnZivoty d = new DoplnZivoty();
    Hrac h = new Hrac();

    @Test
    void execute() {
        h.ubraniZivotu(2);
        h.pridaniPenez(2);
        assertEquals("Zivoty dopneny do maxima",d.execute());
    }

    @Test
    void exit() {
        assertEquals(false,d.exit());
    }
}