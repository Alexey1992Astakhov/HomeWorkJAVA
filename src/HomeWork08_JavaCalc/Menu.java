package HomeWork08_JavaCalc;

import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu (Scanner scanner) {
        this.scanner = scanner;
    }

    public String selectFunction() {
        System.out.print("""
                _________________________________________|
                Выберите действие:                       |
                *****************************************|
                1. Сложение                              |
                2. Вычитание                             |
                3. Деление                               |
                4. Умножение                             |
                *****************************************|
                0. Выход из программы                    |
                _________________________________________|                                         
                """);
        return scanner.nextLine();
    }
}
