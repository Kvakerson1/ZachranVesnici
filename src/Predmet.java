public class Predmet {
    private TypyPredmetu typPredmetu;
    private int sila;
    private int ochrana;

    public Predmet(TypyPredmetu typPredmetu, int sila, int ochrana) {
        this.typPredmetu = typPredmetu;
        this.sila = sila;
        this.ochrana = ochrana;
    }


    public Predmet() {
    }

    public TypyPredmetu getTypPredmetu() {
        return typPredmetu;
    }

    public int getSila() {
        return sila;
    }

    public int getOchrana() {
        return ochrana;
    }
}
