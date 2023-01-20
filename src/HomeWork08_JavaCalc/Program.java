package HomeWork08_JavaCalc;

import HomeWork08_JavaCalc.Controller.DivController;
import HomeWork08_JavaCalc.Controller.MultController;
import HomeWork08_JavaCalc.Controller.SubController;
import HomeWork08_JavaCalc.Controller.SumController;
import HomeWork08_JavaCalc.Model.DivModel;
import HomeWork08_JavaCalc.Model.MultModel;
import HomeWork08_JavaCalc.Model.SubModel;
import HomeWork08_JavaCalc.Model.SumModel;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        View v = new View();
        Presenter p = new Presenter(new SumController(v, new SumModel()), new SubController(v, new SubModel()), new DivController(v, new DivModel()),new MultController(v, new MultModel()), scanner, new Menu(scanner));
        p.start();


    }
}
