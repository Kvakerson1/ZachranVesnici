package commands;

import mapa.HerniMapa;
import predmetyainterakce.Boj;
import predmetyainterakce.Hrac;
import predmetyainterakce.Nepritel;

import java.util.ArrayList;
import java.util.Random;

public class Bojuj extends Command{
    private static int zvyseniSily = 2;
    private boolean jeMrtví = false;
    private static ArrayList<String> l = new ArrayList<>();
    //boj s nepritelem,pokud hrac prohraje ukonci hru
    public String execute() {
        Random rnd = new Random();
        Boj b = new Boj();
        Hrac h = new Hrac();
        HerniMapa herniMapa = new HerniMapa();
        if (!herniMapa.getSoucasnaLokace().contains("bojiste")){
            return "Zde neni nepritel";
        }
        for (int i = 0; i < l.size();i++){
            if (herniMapa.getSoucasnaLokace().equals(l.get(i))){
                return "nepritel je jiz porazen";
            }
        }
        Nepritel n = new Nepritel(zvyseniSily*(rnd.nextInt(4)+7)/2,zvyseniSily*(rnd.nextInt(4)+2)/2);
        b.nacteniInventare(h);

        h = b.boj(h,n);
        if (h.getZivoty() <= 0){
            jeMrtví = true;
            return "Zemřel jsi";

        }
        zvyseniSily+=1;
        l.add(herniMapa.getSoucasnaLokace());
        return h.toString()+"\n"+herniMapa.vypisSoucasnePolohy();
    }


    @Override
    public boolean exit() {
        return jeMrtví;
    }

    public ArrayList<String> getL() {
        return l;
    }

    public int getZvyseniSily() {
        return zvyseniSily;
    }
}
