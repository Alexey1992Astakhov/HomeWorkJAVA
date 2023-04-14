package Exception_task_HW_2;

import java.util.Scanner;
/*
Реализуйте метод, который запрашивает ввод дробного числа (тип с плавающей запятой), и возвращает введенное значение.
Ввод текста вместо числа не должен был приводить к падению приложений, вместо этого необходимо повторно запрашивать у пользователя ввод данных.
*/
public class Task02 {
    private static Scanner scan;
    private static float realNumberInput() {
        scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите дробное число: ");
            String input = scan.nextLine();
            if (input.matches("\\d+[.]\\d+")) {
                return Float.valueOf(input);
            } else {
                System.out.println(("Некорректное значение.\nЗначение должно быть дробным, формата: 123.456"));
            }
        }
    }

    public static void main(String[] args) {
        float value = realNumberInput();
        System.out.printf("Вы ввели число: %f", value);
        scan.close();
    }
}
