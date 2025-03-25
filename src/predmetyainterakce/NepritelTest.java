package predmetyainterakce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NepritelTest {

    Nepritel n = new Nepritel(10, 10);
    @Test
    void ubraniZivotu() {
        n.ubraniZivotu(5);
        assertEquals(5,n.getZivoty());
    }

    @Test
    void jeNaZivu() {
        assertEquals(true,n.jeNaZivu());
    }
    @Test
    void getSila() {
        assertEquals(10,n.getSila());
    }

    @Test
    void testToString() {
        assertEquals("Nepritel Zivoty: 10 Sila: 10",n.toString());
    }
}