package Lesson_OOP;

//1. Настройка класса Телефон, который содержит переменные номер, модель и вес.
//2. экземпляр экземпляра три этого класса.
//3. Выведите на консоль значения их восприятия.
//4. Добавить в класс Телефонные методы: receiveCall, имеет один параметр – имя звонящего.
// Выводит на консоль сообщение «Звонит {имя}». Метод 5. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//6. Добавить конструктор в класс Телефон, который принимает вход на три параметра для инициализации предполагаемого класса
// - номер, модель и вес.
//7. Добавить конструктор, который принимает на вход два параметра для запуска класса - номер, модель.
//8.Добавить конструктор без параметров.
//9. Вызвать из конструктора с параметрами конструктора с двумя.
//10. Добавляется перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
// Вызвать этот метод.
//11. Создайте метод sendMessage с аргументами извлечения. Данный метод принимает на вход номера телефонов, которые будут отправлены.
// Метод выводит на консоль этих номеров телефонов.

public class Phone {
    String number;
    String model;
    Integer weight;

    public Phone() {

    }

    public Phone(String number, String model, int weight) {
        //this.number = number;
        //this.Exception_final_task.model = Exception_final_task.model;
        //this.weight = weight;
        this(number, model); // Вызов консруктора двумя полями внутри конструктора с тремя полями
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", Exception_final_task.model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void receiveCall(String name) {

        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {

        System.out.println("Звонит " + name + " Номер " + number);
    }

    public void sendMessage(String... numbers) {
        System.out.println("Телефон с номером: " + number + " отправляет сообщение");
        for (String number : numbers) {
            System.out.println("Номер для отправки " + number);
        }
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("1234567", "Realme", 123);
        Phone phone2 = new Phone("9876545", "Honor", 124);
        Phone phone3 = new Phone("9877668", "Samsung", 125);
        Phone phone4 = new Phone("565747", "Xiaomi");
        Phone phone5 = new Phone();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone4);
        System.out.println(phone5);
        phone1.receiveCall("Alex");
        phone2.receiveCall("Vlad", "876567777");
        System.out.println(phone1.getNumber());
        phone1.sendMessage("9483493589");
        phone2.sendMessage("859839639", "785488485");
        String[] numbers = {"858499494", "353333556", "8347833879"};
        phone3.sendMessage(numbers);
     }
}
