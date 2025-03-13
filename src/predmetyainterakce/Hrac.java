package predmetyainterakce;

import java.util.ArrayList;

public class Hrac {

    private static int zivoty = 10;
    private static int maxZivoty = 10;
    private static ArrayList<Predmet> inventar = new ArrayList<>();

    public int getZivoty() {
        return zivoty;
    }

    public int getMaxZivoty() {
        return maxZivoty;
    }

    public void ubraniZivotu(int rana){
        zivoty = zivoty-rana;
    }

    public boolean jeNaZivu(){
        if (zivoty <= 0){
            return false;
        }

        return true;
    }


    public ArrayList<Predmet> getInventar() {
        return inventar;
    }

    public void pridaniPredmetu(Predmet p){
        inventar.add(p);
    }
    public String vypisInventare(){
        String vypis = "";
        for (int i = 0; i < inventar.size();i++){
            vypis+= inventar.get(i) + "\n";
        }
        return vypis;
    }

    @Override
    public String toString() {
        return "Hrac Zivoty: " + zivoty;
    }
}
