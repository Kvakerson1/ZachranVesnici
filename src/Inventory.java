import java.util.ArrayList;

public class Inventory {
    private ArrayList<Predmet> inventar = new ArrayList<>();

    public void pridaniPredmetu(Predmet p){
        inventar.add(p);
    }
    public String VypisInventare(){
        String vypis = "";
        for (int i = 0; i < inventar.size();i++){
            vypis+= inventar.get(i) + "\n";
        }
        return vypis;
    }
}
