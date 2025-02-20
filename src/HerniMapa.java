import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HerniMapa {

    private ArrayList<Lokace> mapa = new ArrayList<>();


    public boolean NactiMapu(){
        try (BufferedReader br = new BufferedReader(new FileReader("mapa.txt"))){
            String line;
            while ((line = br.readLine()) != null) {
                String[] lines = line.split(" ");
                mapa.add(new Lokace(lines[0],lines[1],lines[2],lines[3],lines[4]));
            }
            return true;
        }catch (IOException e){
            return false;
        }
    }

    @Override
    public String toString() {
        return "HerniMapa{" +
                "mapa=" + mapa +
                '}';
    }
}
