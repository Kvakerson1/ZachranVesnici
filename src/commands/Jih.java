package commands;

import mapa.HerniMapa;

public class Jih extends Command{
    public String execute() {
        HerniMapa h = new HerniMapa();
        h.posun(3);
        return h.vypisSoucasnePolohy();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
