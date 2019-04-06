public class Main {

    public static void main(String[] args) {


        Model model = new Model();
        View view = new View();



        Controller controller = new Controller(model);

        model.addObserver(controller);
        model.addObserver(view);
        view.addObserver(controller);

        System.out.println("Ho saggiunto il controller come observer del model!");
        System.out.println("Ho saggiunto la view come observer del model!");

        System.out.println("Il model inizialmente ha "+ controller.getDataFromModel()+ "come data");
        view.setMessaggio();


        System.out.println("???->"+ controller.getDataFromModel());


    }
}
