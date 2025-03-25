package mapa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LokaceTest {
    Lokace l = new Lokace("a","b","c","d","e");
    @Test
    void getNazevLokace() {
        assertEquals("a",l.getNazevLokace());
    }

    @Test
    void getSever() {
        assertEquals("b",l.getSever());
    }

    @Test
    void getVychod() {
        assertEquals("c",l.getVychod());
    }

    @Test
    void getJih() {
        assertEquals("d",l.getJih());
    }

    @Test
    void getZapad() {
        assertEquals("e",l.getZapad());
    }

    @Test
    void testToString() {
        assertEquals("nazevLokace:a, sever:b, vychod:c, jih:d, zapad:e",l.toString());
    }
}