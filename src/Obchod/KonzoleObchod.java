package Obchod;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

public class KonzoleObchod {
    private boolean exit = false;
    private HashMap<String, CommandObchod> mapa = new HashMap<>();
    public static String souborPrikazu = "souborPrikazu.txt";
    public void inicializace(){
        mapa.put("zpet", new Zpet());
        mapa.put("help", new Help());
        mapa.put("prodej", new Prodej());
        mapa.put("prodej lup", new ProdejLup());
        mapa.put("kup", new Kup());
        mapa.put("inventar", new Inventar());
        mapa.put("dopln zivoty", new DoplnZivoty());
    }

    private Scanner scanner = new Scanner(System.in);
    private void proved(){
        System.out.print(">>");
        String prikaz = scanner.nextLine();
        prikaz = prikaz.trim();
        prikaz = prikaz.toLowerCase();
        if(mapa.containsKey(prikaz)){
            System.out.println(">> "+mapa.get(prikaz).execute());
            exit = mapa.get(prikaz).exit();
        }else{
            System.out.println(">> Nedefinovany prikaz");
        }
    }

    public void start(){
        inicializace();
        try{
            resetSouboruProPrikazy();
            do{
                proved();
            }while(!exit);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void resetSouboruProPrikazy(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(souborPrikazu,false))){
        }catch(Exception e){
        }
    }
}

