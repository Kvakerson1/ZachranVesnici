package Obchod;

import org.junit.jupiter.api.Test;
import predmetyainterakce.Predmet;
import predmetyainterakce.TypyPredmetu;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ObchodTest {
    Obchod o = new Obchod();
    @Test
    void getNazev() {
        o.setNazev("o");
        assertEquals("o",o.getNazev());
    }
    @Test
    void setNazev() {
        o.setNazev("o");
        assertEquals("o",o.getNazev());
    }

    @Test
    void pridejPredmet() {
        Predmet p = new Predmet(TypyPredmetu.MEC,10);
        o.pridejPredmet(p);
        assertEquals(p,o.getPredmety().get(0));
    }
}