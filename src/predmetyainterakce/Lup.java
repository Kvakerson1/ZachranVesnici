package predmetyainterakce;

public class Lup {
    private TypyLupu jmeno;
    private int cena;

    public Lup(TypyLupu jmeno, int cena) {
        this.jmeno = jmeno;
        this.cena = cena;
    }

    public Lup() {
    }

    public int getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return jmeno + " s cenou " + cena;
    }
}
