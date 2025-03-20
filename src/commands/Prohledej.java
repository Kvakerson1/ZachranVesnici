package commands;

import mapa.HerniMapa;
import mapa.Lokace;
import mapa.Poklad;
import predmetyainterakce.Hrac;
import predmetyainterakce.Predmet;

import java.util.ArrayList;

public class Prohledej extends Command{
    private static ArrayList<String> l = new ArrayList<>();
    //pridani predmetu do inventare
    public String execute() {
        HerniMapa h = new HerniMapa();
        Hrac hrac = new Hrac();
        Poklad p = new Poklad();
        Predmet predmet;
        for (int i = 0; i < l.size();i++){
            if (h.getSoucasnaLokace().equals(l.get(i))){
                return "truhla je jiz vybrana";
            }
        }
        if (h.getSoucasnaLokace().contains("poklad")){
            l.add(h.getSoucasnaLokace());
            predmet = p.prohledej();
            hrac.pridaniPredmetu(predmet);
            return predmet.toString();
        }
        return "Nenalezl jsi nic";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
