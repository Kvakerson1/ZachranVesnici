package mapa;



import predmetyainterakce.Hrac;
import predmetyainterakce.Predmet;
import predmetyainterakce.TypyPredmetu;

import java.util.ArrayList;
import java.util.Random;

public class Poklad {
    public Predmet prohledej(){

        Predmet p = new Predmet();
        Random rnd = new Random();
        int typZbrane = rnd.nextInt(4);
        switch (typZbrane){
            case 0:
                p = new Predmet(TypyPredmetu.MEC,rnd.nextInt(9)+2);
                break;
            case 1:
                p = new Predmet(TypyPredmetu.NUZ,rnd.nextInt(5)+1);
                break;
            case 2:
                p = new Predmet(TypyPredmetu.LUK,rnd.nextInt(10)+1);
                break;
            case 3:
                p = new Predmet(TypyPredmetu.BRNENI, rnd.nextInt(10)+1);
        }
        return p;
    }
}
