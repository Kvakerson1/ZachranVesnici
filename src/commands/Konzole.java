package commands;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

    public class Konzole {
        private boolean exit = false;
        private HashMap<String, Command> mapa = new HashMap<>();
        public static String souborPrikazu = "souborPrikazu.txt";
        public void inicializace(){
            mapa.put("bojuj", new Bojuj());
            mapa.put("sever", new Sever());
            mapa.put("vychod", new Vychod());
            mapa.put("jih", new Jih());
            mapa.put("zapad", new Zapad());
            mapa.put("inventar", new Inventar());
            mapa.put("konec", new Ukonci());
            mapa.put("mluv", new Mluv());
            mapa.put("prohledej", new Prohledej());
            mapa.put("help", new Help());

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
