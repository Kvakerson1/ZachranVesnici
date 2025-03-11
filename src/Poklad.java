import java.util.Random;

public class Poklad {

    public Predmet prohledej(Lokace l){
        Predmet p = new Predmet();
        if (l.getNazevLokace().matches("poklad")){
            Random rnd = new Random();
            if (rnd.nextBoolean()){
                p = new Predmet(TypyPredmetu.BRNENI,0, rnd.nextInt(10)+1);
            }
            else{
                int typZbrane = rnd.nextInt(3);
                switch (typZbrane){
                    case 0:
                        p = new Predmet(TypyPredmetu.MEC,rnd.nextInt(10)+1, 0);
                    case 1:
                        p = new Predmet(TypyPredmetu.NUZ,rnd.nextInt(5)+1, 0);
                    case 2:
                        p = new Predmet(TypyPredmetu.LUK,rnd.nextInt(5)+1, 0);

                }
            }
        }
        return p;
    }
}
