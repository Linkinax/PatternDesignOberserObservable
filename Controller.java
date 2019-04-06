import messages.RequestViewToController;
import messages.ResponseFromController;

import java.util.Observable;
import java.util.Observer;

public class Controller implements Observer {

    private Model model;

    public String getDataFromModel() {
        return "Dato:\t " + model.dato1;
    }


    public Controller(Model mod) {
        this.model = mod;
        System.out.println(("Costruttore controller"));
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg != null && arg instanceof Model) {
            System.out.println("Al controller è arrivato un updated model");
            System.out.println("dati:\t" + model.dato1);

        }
        if (arg != null && arg instanceof messages.RequestViewToController){
            System.out.println("Il controller scrive sul model "+  ((RequestViewToController) arg).data);
            model.dato1 = ((RequestViewToController) arg).data;

        }else{
            System.out.println("Update partito dalla classe del controller, scattato perchè ho modificato il model (arg=null)");
        }

    }

}