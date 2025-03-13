package commands;

import mapa.HerniMapa;

public class Vychod extends Command{
    public String execute() {
        HerniMapa h = new HerniMapa();
        h.posun(2);
        return h.vypisSoucasnePolohy();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
