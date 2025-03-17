package Obchod;

import commands.Mluv;
import mapa.HerniMapa;

import java.util.ArrayList;

public class Kup extends CommandObchod {

    private static ArrayList<Obchod> obchody = new ArrayList<>();
    public String execute() {
        Obchod o = new Obchod();
        HerniMapa herniMapa = new HerniMapa();
        GeneraceObchodu g = new GeneraceObchodu();
        boolean nacteno = false;
        for (int i = 0; i< obchody.size();i++){
            if (obchody.get(i).getNazev().equals(herniMapa.getSoucasnaLokace())){
                o = obchody.get(i);
                nacteno = true;
            }
        }
        if (!nacteno){
            o = g.vytvoreniObchodu();
        }
        System.out.println(o.vypisPredmetu());
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
