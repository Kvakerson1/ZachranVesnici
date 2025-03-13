package commands;

import mapa.HerniMapa;
import mapa.Lokace;

import java.util.ArrayList;

public class Sever extends Command{
    public String execute() {
        HerniMapa h = new HerniMapa();
        Bojuj b = new Bojuj();
        ArrayList<String> l = b.getL();
        if (h.getSoucasnaLokace().contains("bojiste")){
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i).equals(h.getSoucasnaLokace())){
                    h.posun(1);
                    return h.vypisSoucasnePolohy();
                }
            }
            return "Musis nejdriv porazit nepritele";
        }
        h.posun(1);
        return h.vypisSoucasnePolohy();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
