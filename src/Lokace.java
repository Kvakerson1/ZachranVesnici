public class Lokace {
    private String nazevLokace;
    private String sever;
    private String vychod;
    private String jih;
    private String zapad;

    public Lokace(String nazevLokace, String sever, String vychod, String jih, String zapad) {
        this.nazevLokace = nazevLokace;
        this.sever = sever;
        this.vychod = vychod;
        this.jih = jih;
        this.zapad = zapad;
    }

    @Override
    public String toString() {
        return  "nazevLokace:" + nazevLokace + '\'' +
                ", sever:" + sever + '\'' +
                ", vychod:" + vychod + '\'' +
                ", jih:" + jih + '\'' +
                ", zapad:" + zapad + '\'';
    }
}
