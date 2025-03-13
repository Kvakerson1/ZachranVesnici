package commands;

public class Help extends Command{
    public String execute() {
        return "bojuj,help,inventar,jih,mluv,prohledej,sever,konec,vychod,zapad";
    }

    @Override
    public boolean exit() {
        return false;
    }

}
