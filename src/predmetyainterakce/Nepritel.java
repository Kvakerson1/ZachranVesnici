package predmetyainterakce;

public class Nepritel {

    private int zivoty;
    private int sila;

    public Nepritel(int zivoty, int sila) {
        this.zivoty = zivoty;
        this.sila = sila;

    }

    public void ubraniZivotu(int rana){
        zivoty = zivoty-rana;
    }
    public boolean jeNaZivu(){
        if (zivoty <= 0){
            return false;
        }
        return true;
    }
    public int getSila() {

        return sila;
    }

    public int getZivoty() {
        return zivoty;
    }

    public String toString() {
        return "Nepritel Zivoty: " + zivoty + " Sila: " + sila;
    }

}
