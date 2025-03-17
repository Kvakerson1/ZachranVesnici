package predmetyainterakce;

import java.util.Scanner;

public class ProdejVeci {
    public String prodej(){
        Hrac h = new Hrac();
        if (h.getInventar().isEmpty()){
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
                h.getInventar().remove(i);
                return "Kupuju";
            }
        }
        return "Takovy predmet nemas";
    }
}
