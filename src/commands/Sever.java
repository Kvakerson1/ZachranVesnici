package commands;

import mapa.HerniMapa;

public class Sever extends Command{
    public String execute() {
        HerniMapa h = new HerniMapa();
        h.posun(1);
        return h.vypisSoucasnePolohy();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
