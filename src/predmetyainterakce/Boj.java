package predmetyainterakce;

import java.util.Random;

public class Boj {
    private boolean maNuz = false;
    private int polohaNozeVInventari;
    private boolean maLuk = false;
    private int polohaLukuVInventari;
    private boolean maMec = false;
    private int polohaMeceVInventari;

    private boolean maBrneni = false;
    private int polohaBrneniVInventari;


    public Hrac boj(Hrac h, Nepritel n){

        Random rnd = new Random();
        GeneraceLupu g = new GeneraceLupu();
        int rana;
        System.out.println(n.toString());
        if (maLuk){
            rana = rnd.nextInt(h.getInventar().get(polohaLukuVInventari).getSila()-5)+6;
            n.ubraniZivotu(rana);
            System.out.println("strela lukem za " + rana);
            System.out.println(n.toString() + "\n");
            if (!n.jeNaZivu()){
                Lup l = g.vytvor();
                System.out.println("Dostal jsi: " + l.toString());
                h.pridaniLupu(l);
                return h;
            }
        }
        while(true){
            if (maMec){
                rana = rnd.nextInt(h.getInventar().get(polohaMeceVInventari).getSila())+1;
                n.ubraniZivotu(rana);
                System.out.println("rana mecem za " + rana);
                System.out.println(n.toString() + "\n");
                if (!n.jeNaZivu()){
                    Lup l = g.vytvor();
                    System.out.println("Dostal jsi: " + l.toString());
                    h.pridaniLupu(l);
                    return h;
                }
            }
            else {
                n.ubraniZivotu(1);
                System.out.println("rana pesti za " + 1);
                System.out.println(n.toString() + "\n");
                if (!n.jeNaZivu()){
                    Lup l = g.vytvor();
                    System.out.println("Dostal jsi: " + l.toString());
                    h.pridaniLupu(l);
                    return h;
                }
            }
            if (maNuz){
                rana = rnd.nextInt(h.getInventar().get(polohaNozeVInventari).getSila())+1;
                n.ubraniZivotu(rana);
                System.out.println("rana nozem za " + rana);
                System.out.println(n.toString() + "\n");
                if (!n.jeNaZivu()){
                    Lup l = g.vytvor();
                    System.out.println("Dostal jsi: " + l.toString());
                    h.pridaniLupu(l);
                    return h;
                }
            }
            if (maBrneni){
                rana = rnd.nextInt(n.getSila())+1;
                if (rana > h.getInventar().get(polohaBrneniVInventari).getSila()){
                    h.ubraniZivotu(rana-h.getInventar().get(polohaBrneniVInventari).getSila());
                    System.out.println("rana od nepritele za " + rana);
                    System.out.println(h.toString() + "\n");
                    if (!h.jeNaZivu()){
                        return h;

                    }
                }
                else{
                    h.ubraniZivotu(1);
                    System.out.println("rana od nepritele za " + 1);
                    System.out.println(h.toString() + "\n");
                    if (!h.jeNaZivu()){
                        return h;
                    }
                }
            }
            else{
                rana = rnd.nextInt(n.getSila())+1;
                h.ubraniZivotu(rana);
                System.out.println("rana od nepritele za " + rana);
                System.out.println(h.toString() + "\n");
                if (!h.jeNaZivu()){
                    return h;
                }
            }
        }
    }
    public void nacteniInventare(Hrac h){
        for (int i = 0; i< h.getInventar().size(); i++){
            if (h.getInventar().get(i).getTypPredmetu().equals(TypyPredmetu.LUK)){
                if (maLuk){
                    if (h.getInventar().get(i).getSila() > h.getInventar().get(polohaLukuVInventari).getSila()){
                        polohaLukuVInventari = i;
                    }
                }else{
                    maLuk = true;
                    polohaLukuVInventari = i;
                }
            }
            if (h.getInventar().get(i).getTypPredmetu().equals(TypyPredmetu.NUZ)){
                if (maNuz){
                    if (h.getInventar().get(i).getSila() > h.getInventar().get(polohaNozeVInventari).getSila()){
                        polohaNozeVInventari = i;
                    }
                }else{
                    maNuz = true;
                    polohaNozeVInventari = i;
                }
            }
            if (h.getInventar().get(i).getTypPredmetu().equals(TypyPredmetu.MEC)){
                if (maMec){
                    if (h.getInventar().get(i).getSila() > h.getInventar().get(polohaMeceVInventari).getSila()){
                        polohaMeceVInventari = i;
                    }
                }else{
                    maMec = true;
                    polohaMeceVInventari = i;
                }

            }
            if (h.getInventar().get(i).getTypPredmetu().equals(TypyPredmetu.BRNENI)){
                if (maBrneni){
                    if (h.getInventar().get(i).getSila() > h.getInventar().get(polohaBrneniVInventari).getSila()){
                        polohaBrneniVInventari = i;
                    }
                }else{
                    maBrneni = true;
                    polohaBrneniVInventari = i;
                }

            }
        }
    }
}
