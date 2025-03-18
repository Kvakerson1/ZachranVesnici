package Obchod;

import predmetyainterakce.Predmet;

import java.util.ArrayList;

public class Obchod {
    private String nazev;
    private ArrayList<Predmet> predmety = new ArrayList<>();

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
        String vypis = "";
        for (int i = 0; i < predmety.size(); i++) {
            vypis += predmety.get(i).toString() + " a s cenou " + (predmety.get(i).getSila()+predmety.get(i).getSila()/2) + "\n";
        }
        return vypis;
    }
}
