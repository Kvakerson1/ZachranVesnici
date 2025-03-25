package mapa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HerniMapaTest {

    HerniMapa h = new HerniMapa();
    @Test
    void nactiMapu() {
        h.NactiMapu();
        assertEquals("nazevLokace:start, sever:poklad1, vychod:null, jih:null, zapad:null",h.vypisSoucasnePolohy());
    }

    @Test
    void posun() {
        h.NactiMapu();
        assertEquals(true,h.posun(1));
    }

    @Test
    void vypisSoucasnePolohy() {
        h.NactiMapu();
        assertEquals("nazevLokace:start, sever:poklad1, vychod:null, jih:null, zapad:null",h.vypisSoucasnePolohy());
    }

    @Test
    void getSoucasnaLokace() {
        assertEquals("start",h.getSoucasnaLokace());
    }
}