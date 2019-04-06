import messages.RequestViewToController;
import messages.ResponseFromController;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class View extends Observable implements Observer {

    private String messaggio;

    public View(){
        System.out.println("Sono la cazzo di view");
    }

    public void setMessaggio()
    {
        System.out.println("Cosa vuoi spedire?! ");
        Scanner ss = new Scanner(System.in);
        String input = ss.nextLine();
        this.messaggio = input;

        setChanged();
        notifyObservers(new RequestViewToController(this.messaggio));
    }

    @Override
    public void update(Observable o, Object arg) {

        if (arg != null && arg instanceof messages.RequestViewToController){
            System.out.println("Il controller dovrebbe scrivere  : "+ ((RequestViewToController) arg).data);


        }else{
            System.out.println("Non è arrivato un RequestViewToController (arg=null)");
        }

    }
}
