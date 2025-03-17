package Obchod;

import predmetyainterakce.Hrac;

import java.util.ArrayList;

public class ProdejLup extends CommandObchod {

    public String execute() {
        Hrac h = new Hrac();
        String vypis = "Prodal jsi ";
        int cena = 0;
        if (h.getLup().isEmpty()){
            System.out.println("není co prodat");
        }
        for (int i = 0; i < h.getLup().size();i++) {
            vypis += h.getLup().get(i).toString() + " ";
            cena += h.getLup().get(i).getCena();
        }
        h.setLup(new ArrayList<>());
        h.pridaniPenez(cena);
        vypis += "za celkovou cenu: " + cena;
        return vypis;
    }

    @Override
    public boolean exit() {
        return false;
    }
}
