package predmetyainterakce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LupTest {
    Lup l = new Lup(TypyLupu.DRAP,10);
    @Test
    void getCena() {
        assertEquals(10,l.getCena());
    }

    @Test
    void testToString() {
        assertEquals("DRAP s cenou 10",l.toString());
    }
}