package Obchod;

import predmetyainterakce.ProdejVeci;

public class Prodej extends CommandObchod {

    public String execute() {
        ProdejVeci p = new ProdejVeci();
        return p.prodej();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
