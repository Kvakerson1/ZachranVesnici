package Obchod;

import predmetyainterakce.ProdejVeci;

public class Prodej extends CommandObchod {
    //proda vybrany predmet
    public String execute() {
        ProdejVeci p = new ProdejVeci();
        return p.prodej();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
