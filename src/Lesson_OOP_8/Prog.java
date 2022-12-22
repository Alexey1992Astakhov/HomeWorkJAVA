package Lesson_OOP_8;

import java.util.Scanner;
import java.util.function.Supplier;

// interface Supplier < T >{
// T get();
//}

public class Prog {
    public static void main(String[] args) {
        Supplier < User > userFact = () -> {
            Scanner in = new Scanner (System.in);
            System.out.println("Введите имя ");
            String name = in.nextLine();
            return new User(name);
        };
        User user1 = userFact.get();
        User user2 = userFact.get();

        System.out.println("Имя user1 : " + user1.getName());
        System.out.println("Имя user2 : " + user2.getName());
    }
}

