import commands.Konzole;
import mapa.HerniMapa;
import predmetyainterakce.Hrac;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HerniMapa herniMapa = new HerniMapa();
        herniMapa.NactiMapu();
        System.out.println(herniMapa.vypisSoucasnePolohy());
        Konzole k = new Konzole();
        k.start();
    }
}