package predmetyainterakce;

public class Predmet {
    private TypyPredmetu typPredmetu;
    private int sila;


    public Predmet(TypyPredmetu typPredmetu, int sila) {
        this.typPredmetu = typPredmetu;
        this.sila = sila;

    }

    public void setTypPredmetu(TypyPredmetu typPredmetu) {
        this.typPredmetu = typPredmetu;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }

    public Predmet() {
    }

    public TypyPredmetu getTypPredmetu() {
        return typPredmetu;
    }

    public int getSila() {
        return sila;
    }



    @Override
    public String toString() {
        return typPredmetu + " se silou " + sila;
    }
}
