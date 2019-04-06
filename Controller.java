import messages.ResponseFromController;

import java.util.Observable;
import java.util.Observer;

public class Controller implements Observer {

    private Model model;

    public void getDataFromModel() {
        System.out.println("Dato iniziale:\t " + model.dato1);
    }

    public void elaboraDato1() {

        model.modificaDato1();
    }

    public Controller(Model mod) {
        this.model = mod;
        System.out.println(("Costruttore controller"));
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg != null && arg instanceof messages.ResponseFromController){
            System.out.println("Il controlle mi ha parlato1: "+ ((ResponseFromController) arg).data);


        }else{
            System.out.println("Update partito dalla classe del controller, scattato perchè ho modificato il model (arg=null)");
        }

    }

    public void update(Observable o, messages.ResponseFromController arg) {



        System.out.println("Il controlle mi ha parlato: "+ arg.data);

    }
}