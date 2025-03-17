package Obchod;

public abstract class CommandObchod {
    protected String prikaz;
    public void setPrikaz(String prikaz){
        this.prikaz = prikaz;
    }
    public abstract String execute();
    public abstract boolean exit();
}
