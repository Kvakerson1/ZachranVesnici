package commands;

import mapa.HerniMapa;

import java.util.ArrayList;

public class Vychod extends Command{
    private boolean konec = false;
    //presun na vychod
    public String execute() {
        HerniMapa h = new HerniMapa();
        Bojuj b = new Bojuj();
        ArrayList<String> l = b.getL();
        if (h.getSoucasnaLokace().contains("bojiste")){
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i).equals(h.getSoucasnaLokace())){
                    h.posun(2);
                    if (h.getSoucasnaLokace().contains("cil")){
                        konec = true;
                        return "Vyhral jsi";
                    }
                    return h.vypisSoucasnePolohy();
                }
            }
            return "Musis nejdriv porazit nepritele";
        }
        h.posun(2);
        if (h.getSoucasnaLokace().contains("cil")){
            konec = true;
            return "Vyhral jsi";
        }
        return h.vypisSoucasnePolohy();
    }

    @Override
    public boolean exit() {
        return konec;
    }
}
