package Lesson_OOP;

public class Main {
    public static void main(String[] args) {

        Male ivanov = new Male("Petr", "Ivanov",1);
        ivanov.printInfo();
        Female petrova = new Female("Мария", "Петрова", 2);
        petrova.printInfo();
        Integer gen = ivanov.getParent();
        ivanov.setParent(2);
        ivanov.printInfo();
        }
    }
