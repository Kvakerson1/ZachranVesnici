package Obchod;

import predmetyainterakce.Predmet;

import java.util.ArrayList;

public class Obchod {
    private String nazev;
    private ArrayList<Predmet> predmety;
    private int cenaDoplneniZivotu;

    public Obchod(String nazev, ArrayList<Predmet> predmety, int cenaDoplneniZivotu) {
        this.nazev = nazev;
        this.predmety = predmety;
        this.cenaDoplneniZivotu = cenaDoplneniZivotu;
    }

    public String getNazev() {
        return nazev;
    }

    public ArrayList<Predmet> getPredmety() {
        return predmety;
    }

    public int getCenaDoplneniZivotu() {
        return cenaDoplneniZivotu;
    }

}
