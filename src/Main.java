import commands.Konzole;
import mapa.HerniMapa;
import predmetyainterakce.Hrac;
import predmetyainterakce.Predmet;
import predmetyainterakce.TypyPredmetu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HerniMapa herniMapa = new HerniMapa();
        herniMapa.NactiMapu();
        Hrac h = new Hrac();
        h.pridaniPredmetu(new Predmet(TypyPredmetu.BRNENI,10,0));
        Konzole k = new Konzole();
        k.start();

    }
}