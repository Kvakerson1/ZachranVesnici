package predmetyainterakce;

import java.io.Serializable;
import java.util.ArrayList;

public class Hrac implements Serializable {

    private static int zivoty = 10;
    private static int maxZivoty = 10;
    private static ArrayList<Predmet> inventar = new ArrayList<>();
    private static ArrayList<Lup> lup = new ArrayList<>();

    private static int penize = 0;

    public int getZivoty() {
        return zivoty;
    }

    public int getMaxZivoty() {
        return maxZivoty;
    }

    public int getPenize() {
        return penize;
    }

    public void setLup(ArrayList<Lup> lup) {
        Hrac.lup = lup;
    }

    public void pridaniPenez(int pridej){
        penize+=pridej;
    }
    public void odebraniPenez(int odeber){
        penize-=odeber;
    }

    public void setZivoty(int zivoty) {
        Hrac.zivoty = zivoty;
    }

    public void setMaxZivoty(int maxZivoty) {
        Hrac.maxZivoty = maxZivoty;
    }

    public void setInventar(ArrayList<Predmet> inventar) {
        Hrac.inventar = inventar;
    }

    public void setPenize(int penize) {
        Hrac.penize = penize;
    }

    public void ubraniZivotu(int rana){
        zivoty = zivoty-rana;
    }

    public void pridaniZivotu(int pridani){
        zivoty = zivoty+pridani;
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

    public ArrayList<Lup> getLup() {
        return lup;
    }


    public void pridaniPredmetu(Predmet p){
        inventar.add(p);
    }

    public void pridaniLupu(Lup l){
        lup.add(l);
    }

    public String vypisInventare(){
        String vypis = "";
        for (int i = 0; i < inventar.size();i++){
            vypis+= inventar.get(i) + "\n";
        }
        return vypis;
    }

    public String vypisLupu(){
        String vypis = "";
        for (int i = 0; i <lup.size();i++){
            vypis+= lup.get(i) + "\n";
        }
        return vypis;
    }



    @Override
    public String toString() {
        return "Hrac Zivoty: " + zivoty;
    }
}
