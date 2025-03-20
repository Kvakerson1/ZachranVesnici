package Obchod;


import mapa.HerniMapa;
import mapa.Poklad;

import java.util.Random;

public class GeneraceObchodu {
    //vytvori obchod i s nabidkami
    public Obchod vytvoreniObchodu(){
        Obchod o = new Obchod();
        Poklad p = new Poklad();
        HerniMapa herniMapa = new HerniMapa();
        o.setNazev(herniMapa.getSoucasnaLokace());
        Random rnd = new Random();
        for (int i = 0;i<rnd.nextInt(5)+1;i++){
            o.pridejPredmet(p.prohledej());
        }
        return o;
    }
}
