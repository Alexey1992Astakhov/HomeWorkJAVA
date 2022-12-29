package HomeWork07_OOP;

public class Program_2 {
    public static void main(String[] args) {

        Generalization<Double,Integer, String> people = new Generalization<>(14.2, 28, "Валерий");

        GenericMethods peoples = new GenericMethods();
        String[] peopl = {"Алексей ", "Екатерина ", "Feofan ", "Ivan ", "Sergei"};
        Integer[] numbers = {5, 7, 9, 4, 1, 56, 92, 190};



        people.printShow();
        people.setAge(18);
        people.printShow();
        int v = people.getAge();
        System.out.println("Возраст " + v );
        String str = people.name;
        System.out.println("Имя " + str);
        double n = people.getId();
        System.out.println("ID: " + n);
        System.out.println();
        peoples.<String>printShows(peopl);
        System.out.println();
        peoples.<Integer>printShows(numbers);
    }
}
