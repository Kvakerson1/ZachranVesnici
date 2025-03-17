package Obchod;

import predmetyainterakce.Predmet;

import java.util.ArrayList;

public class Obchod {
    private String nazev;
    private ArrayList<Predmet> predmety;

    public Obchod(String nazev, ArrayList<Predmet> predmety) {
        this.nazev = nazev;
        this.predmety = predmety;
    }
    public Obchod() {
    }

    public String getNazev() {
        return nazev;
    }

    public ArrayList<Predmet> getPredmety() {
        return predmety;
    }
    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public void pridejPredmet(Predmet p ){
        predmety.add(p);
    }

    public String vypisPredmetu() {
        return predmety.toString();
    }

    @Override
    public String toString() {
        return "Obchod{" +
                "nazev='" + nazev + '\'' +
                ", predmety=" + predmety +
                '}';
    }
}
