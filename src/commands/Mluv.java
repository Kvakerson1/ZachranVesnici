package commands;

import Obchod.KonzoleObchod;
import mapa.HerniMapa;

public class Mluv extends Command{
    public String execute() {
        KonzoleObchod o = new KonzoleObchod();
        HerniMapa herniMapa = new HerniMapa();
        if (!herniMapa.getSoucasnaLokace().contains("obchod")){
            return "Zde neni s kym mluvit";
        }
        System.out.println("Jsi v obchodě");
        o.start();
        System.out.println("jsi zpet na mape");
        System.out.println(herniMapa.vypisSoucasnePolohy());
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
