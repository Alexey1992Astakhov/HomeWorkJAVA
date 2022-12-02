package homeWork03;

import java.util.Scanner;

/*
 *+Задано уравнение вида q + w = e. При q, w, e >= 0.
 * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
 * Требуется восстановить выражение до верного равенства.
 * Предложить хотя бы одно решение или сообщить, что его нет.
 */


public class TaskHome {
    public static String replacemet(String str, String num) {
        return str.replace("?", num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите уравнение вида q+w=e: ");
        String text = sc.nextLine();
        text = text.replace('+', ' ').replace('=', ' ');
        String[] words = text.split(" ");
        boolean ex = false;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                String q = replacemet(words[0], Integer.toString(i));
                String w = replacemet(words[1], Integer.toString(j));
                int a = Integer.parseInt(q);
                int b = Integer.parseInt(w);
                int c = Integer.parseInt(words[2]);
                if (a + b == c) {
                    System.out.printf("%d + %d = %d\n", a, b, c);
                    ex = true;
                }
            }
        }
        if (!ex) {
            System.out.println("Решений нет");
        }
    }
}
