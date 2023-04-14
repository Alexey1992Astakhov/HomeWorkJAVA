package Exception_task_HW_2;
import java.util.Scanner;
/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/
public class Task02_3 {
    private static Scanner scanner;

    /*
    Метод , ввод данных пользователем в случае ввода пустой строки, выкидывает исключение EmptyStringException
     */
    private static String userInput() throws EmptyStringException {

        scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();

        if (input.equals("")) {
            throw new EmptyStringException();
        }
        return input;
    }

    public static void main(String[] args) {
        String value = userInput();
        System.out.printf("Вы ввели: %s", value);
        scanner.close();
    }

}

class EmptyStringException extends RuntimeException {
    // если код выбросит исключение, выводим в консоль сообщение
    public EmptyStringException() {
        System.out.println("Пустые строки вводить нельзя");
    }
}