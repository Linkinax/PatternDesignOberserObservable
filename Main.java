public class Main {

    public static void main(String[] args) {


        Model model = new Model();

        Controller controller = new Controller(model);

        model.addObserver(controller);
        System.out.println("Ho saggiunto il controller come observer del model!");


        System.out.println("Hello World!");


        controller.getDataFromModel();
        controller.elaboraDato1();
        controller.getDataFromModel();

    }
}
