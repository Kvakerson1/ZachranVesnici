package Obchod;

import predmetyainterakce.Hrac;

public class DoplnZivoty extends CommandObchod {
    //doplni hraci zivoty za penize
    public String execute() {
        Hrac h = new Hrac();
        if (h.getZivoty() == h.getMaxZivoty()){
            return "Mas uz plne zivoty";
        }
        if (h.getPenize() == 0){
            return "Nemas penize";
        }
        if (h.getPenize() >= h.getMaxZivoty()-h.getZivoty()){
            h.odebraniPenez(h.getMaxZivoty()-h.getZivoty());
            h.pridaniZivotu(h.getMaxZivoty()-h.getZivoty());
            return "Zivoty dopneny do maxima";
        }
        if (h.getPenize() <= h.getMaxZivoty()-h.getZivoty()){
            int doplneni = h.getPenize();
            h.pridaniZivotu(doplneni);
            h.odebraniPenez(doplneni);
            return "Doplneno " + doplneni;
        }

        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
