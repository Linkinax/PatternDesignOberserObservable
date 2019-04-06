import javafx.beans.InvalidationListener;

import java.util.Observable;

public class Model extends Observable {

    Controller listaListener;


    public String dato1= "Fai finta che questa sia il gameboard\n";

    public void modificaDato1() {
        System.out.println("Mo' modifico il gameboard...");
        this.dato1 = "Fai finta che questa sia il gameboard\t + CHANGED MATE\n";

        setChanged();
        //otifyObservers();
        messages.ResponseFromController mex = new messages.ResponseFromController();
        mex.setData("Dio porco");
        notifyObservers(mex);
    }

    public Model(){

        System.out.println("costruttore del model");
    }

}
