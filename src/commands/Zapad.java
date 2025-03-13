package commands;

import mapa.HerniMapa;

public class Zapad extends Command{
    public String execute() {
        HerniMapa h = new HerniMapa();
        h.posun(4);
        return h.vypisSoucasnePolohy();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
