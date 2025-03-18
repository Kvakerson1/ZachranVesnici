package predmetyainterakce;

import Obchod.Kup;
import commands.Mluv;
import mapa.HerniMapa;

import java.util.ArrayList;
import java.util.Scanner;

public class ProdejVeci {
    public String prodej(){
        Hrac h = new Hrac();
        Mluv m = new Mluv();
        HerniMapa herniMapa = new HerniMapa();
        if (h.getInventar().isEmpty() && h.getLup().isEmpty()){
            return "nic u sebe nemas";
        }
        System.out.println("Co chceš prodat?");
        Scanner sc = new Scanner(System.in);
        Predmet p = new Predmet();
        String vyber = sc.nextLine();
        int vyber2;
        switch (vyber){
            case "mec":
                p.setTypPredmetu(TypyPredmetu.MEC);
                break;
            case "luk":
                p.setTypPredmetu(TypyPredmetu.LUK);
                break;
            case "brneni":
                p.setTypPredmetu(TypyPredmetu.BRNENI);
                break;
            case "nuz":
                p.setTypPredmetu(TypyPredmetu.NUZ);
                break;
            case "lup":
                String vypis = "Prodal jsi ";
                int cena = 0;
                if (h.getLup().isEmpty()){
                    return "není co prodat";
                }
                for (int i = 0; i < h.getLup().size();i++) {
                    vypis += h.getLup().get(i).toString() + " ";
                    cena += h.getLup().get(i).getCena();
                }
                h.setLup(new ArrayList<>());
                h.pridaniPenez(cena);
                vypis += "za celkovou cenu: " + cena;
                return vypis;
            default:
                return "tohle nekupuji";
        }
        System.out.println("A s jakou silou");
        try {
            vyber2 = sc.nextInt();
        }catch (Exception e){
            return "to je podivná síla";
        }
        p.setSila(vyber2);
        for (int i = 0; i< h.getInventar().size();i++){
            if (h.getInventar().get(i).toString().equals(p.toString())){
                h.pridaniPenez(h.getInventar().get(i).getSila());
                m.getSoucasnyObchod().pridejPredmet(h.getInventar().get(i));
                h.getInventar().remove(i);
                return "Kupuju";
            }
        }
        return "Takovy predmet nemas";
    }
}
