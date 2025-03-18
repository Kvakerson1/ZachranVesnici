package Obchod;
public class Help extends CommandObchod{
    public String execute() {
        return "kup,prodej,inventar,prodej lup,dopln zivoty,zpet";
    }

    @Override
    public boolean exit() {
        return false;
    }

}
