package commands;

import predmetyainterakce.Hrac;

public class Inventar extends Command{
    public String execute() {
        Hrac h = new Hrac();

        return h.vypisInventare() + "\n" + h.vypisLupu() + "\n"  + "penize: " + h.getPenize();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
