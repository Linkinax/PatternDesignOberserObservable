import javafx.beans.InvalidationListener;

import java.util.Observable;

public class Model extends Observable {



    public String dato1= "-->Fai finta che questa sia il gameboard<--- ";

    public void modificaDato1( String changes) {
        System.out.println("Mo' modifico il gameboard...");
        this.dato1 = "Fai finta che questa sia il gameboard\t" +changes ;
        setChanged();
        notifyObservers(this);
    }

    public Model(){

        System.out.println("costruttore del model");
    }

}
