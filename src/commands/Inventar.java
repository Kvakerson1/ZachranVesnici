package commands;

import predmetyainterakce.Hrac;

public class Inventar extends Command{
    //vypis inventare
    public String execute() {
        Hrac h = new Hrac();

        return h.vypisInventare() + "\n" + h.vypisLupu() + "\n" + "zivoty: " + h.getZivoty() + "\n"  + "penize: " + h.getPenize();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
