package predmetyainterakce;

import commands.Bojuj;

import java.util.Random;

public class GeneraceLupu {
    //vztvori nahodny predmet co vypadne z nepritele
    public Lup vytvor(){
        Bojuj b = new Bojuj();
        Lup l = new Lup();
        Random rnd = new Random();
        int typZbrane = rnd.nextInt(4);
        switch (typZbrane){
            case 0:
                l = new Lup(TypyLupu.DRAP,rnd.nextInt(10)*b.getZvyseniSily()/2+1);
                break;
            case 1:
                l = new Lup(TypyLupu.KUZE,rnd.nextInt(10)*b.getZvyseniSily()/2+1);
                break;
            case 2:
                l = new Lup(TypyLupu.ZUB,rnd.nextInt(10)*b.getZvyseniSily()/2+1);
                break;
            case 3:
                l = new Lup(TypyLupu.SUPINA,rnd.nextInt(10)*b.getZvyseniSily()/2+1);
        }
        return l;
    }
}
