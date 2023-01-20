package HomeWork08_JavaCalc;

import HomeWork08_JavaCalc.Controller.DivController;
import HomeWork08_JavaCalc.Controller.MultController;
import HomeWork08_JavaCalc.Controller.SubController;
import HomeWork08_JavaCalc.Controller.SumController;

import java.util.Scanner;

public class Presenter {
    SumController sumController;
    SubController subController;
    DivController divController;
    MultController multController;
    Menu menu;
    Scanner scanner;

    public Presenter(SumController sumController, SubController subController, DivController divController, MultController multController, Scanner scanner, Menu menu) {
        this.sumController = sumController;
        this.subController = subController;
        this.divController = divController;
        this.multController = multController;
        this.scanner = scanner;
        this.menu = menu;
    }

    public void start() {

        while (true) {
            switch (menu.selectFunction()) {
                case "1" -> // сложение
                        sumController.Sum();
                case "2" -> // вычитание
                        subController.Sub();
                case "3" -> // деление
                        divController.Div();
                case "4" -> // умножение
                        multController.Mult();
                case "0" -> // выход
                        System.exit(0);
                default -> System.out.println("Неверный ввод");
            }
        }
    }


}



