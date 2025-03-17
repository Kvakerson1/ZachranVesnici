package commands;

import mapa.HerniMapa;
import predmetyainterakce.Boj;
import predmetyainterakce.Hrac;
import predmetyainterakce.Nepritel;

import java.util.ArrayList;
import java.util.Random;

public class Bojuj extends Command{
    private static int zvyseniSily = 1;
    private boolean jeMrtví = false;
    private static ArrayList<String> l = new ArrayList<>();
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
        Nepritel n = new Nepritel(zvyseniSily*(rnd.nextInt(6)+5),zvyseniSily*(rnd.nextInt(5)+1));
        b.nacteniInventare(h);

        h = b.boj(h,n);
        if (h.getZivoty() <= 0){
            System.out.println("Zemřel jsi");
            jeMrtví = true;
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
}
