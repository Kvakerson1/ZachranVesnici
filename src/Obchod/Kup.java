package Obchod;

import commands.Mluv;
import mapa.HerniMapa;
import predmetyainterakce.Hrac;
import predmetyainterakce.Predmet;

import java.util.ArrayList;
import java.util.Scanner;

public class Kup extends CommandObchod {
    public String execute() {
        Mluv m = new Mluv();
        Hrac h = new Hrac();
        Scanner sc = new Scanner(System.in);
        System.out.println(m.getSoucasnyObchod().vypisPredmetu());
        System.out.println("kolikaty predmet chces koupit");
        int index;
        try {
            index = sc.nextInt()-1;
            Predmet p = m.getSoucasnyObchod().getPredmety().get(index);
            if (index < m.getSoucasnyObchod().getPredmety().size()){
                if (h.getPenize() >= (p.getSila()+ p.getSila()/2)){
                    h.odebraniPenez(p.getSila()+ p.getSila()/2);
                    h.pridaniPredmetu(p);
                    m.getSoucasnyObchod().getPredmety().remove(index);
                    return "Koupil jsi predmet " + p.toString();
                }else {
                    return "Nemas dostatek penez";
                }



            }
        }catch (Exception e){
            return "Tenhle predmet nemam";
        }
        return "Tenhle predmet nemam";

    }

    @Override
    public boolean exit() {
        return false;
    }
}
