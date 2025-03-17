package predmetyainterakce;

import java.util.Random;

public class GeneraceLupu {
    public Lup vytvor(){

        Lup l = new Lup();
        Random rnd = new Random();
        int typZbrane = rnd.nextInt(4);
        switch (typZbrane){
            case 0:
                l = new Lup(TypyLupu.DRAP,rnd.nextInt(10)+1);
                break;
            case 1:
                l = new Lup(TypyLupu.KUZE,rnd.nextInt(10)+1);
                break;
            case 2:
                l = new Lup(TypyLupu.ZUB,rnd.nextInt(10)+1);
                break;
            case 3:
                l = new Lup(TypyLupu.SUPINA,rnd.nextInt(10)+1);
        }
        return l;
    }
}
