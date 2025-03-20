package Obchod;
public class Zpet extends CommandObchod {
    //vrati te zpet na mapu
    public String execute() {
        return "Jsi zpet na mape";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
