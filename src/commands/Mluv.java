package commands;

import Obchod.KonzoleObchod;
import Obchod.Obchod;
import mapa.HerniMapa;
import predmetyainterakce.Hrac;
import Obchod.GeneraceObchodu;

import java.util.ArrayList;

public class Mluv extends Command{
    private static ArrayList<Obchod> obchody = new ArrayList<>();
    private static Obchod soucasnyObchod;
    public String execute() {
        KonzoleObchod k = new KonzoleObchod();
        HerniMapa herniMapa = new HerniMapa();
        if (!herniMapa.getSoucasnaLokace().contains("obchod")){
            return "Zde neni s kym mluvit";
        }
        System.out.println("Jsi v obchodě");

        GeneraceObchodu g = new GeneraceObchodu();
        Hrac h = new Hrac();

        boolean nacteno = false;
        for (int i = 0; i< obchody.size();i++){
            if (obchody.get(i).getNazev().equals(herniMapa.getSoucasnaLokace())){
                soucasnyObchod = obchody.get(i);
                nacteno = true;
            }
        }
        if (!nacteno){
            soucasnyObchod = g.vytvoreniObchodu();
            obchody.add(soucasnyObchod);
        }

        k.start();
        System.out.println("jsi zpet na mape");
        System.out.println(herniMapa.vypisSoucasnePolohy());
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }

    public ArrayList<Obchod> getObchody() {
        return obchody;
    }

    public Obchod getSoucasnyObchod() {
        return soucasnyObchod;
    }
}
