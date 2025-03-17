package Obchod;


import predmetyainterakce.Hrac;

public class Inventar extends CommandObchod {
    public String execute() {
        Hrac h = new Hrac();

        return h.vypisInventare() + "\n" + h.vypisLupu() + "\n" + "penize: " + h.getPenize();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
