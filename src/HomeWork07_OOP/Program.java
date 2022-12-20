package HomeWork07_OOP;

public class Program {
    public static void main(String[] args) {
        Parents father = new Parents("Астахов Алексей Андреевич", 30, "мужской", 1, "70 кг.", "Будущий программист","Писать код");
        Parents mother = new Parents("Астахова Екатерина Вадимовна", 27, "женский", 2, "45 кг.","Домохозяйка", "");
        Children children1 = new Children("Астахов Андрей Алексеевич", 7, "мужской", 3, "22 кг.");
        Children children2 = new Children("Астахов Кирилл Алексеевич", 5, "мужской", 4, "18 кг.");
        Realisation obj = new Realisation();
        Realistaion_1 obj_1 = new Realistaion_1();
        TestClass obj_2 = new TestClass();
        MyChildId obj_3 = new MyChildId();
        Father obi;
        children2.greeting("");
        father.setFio("Папа");
        father.childToSchool("8 часам");
        mother.setFio("Мама");
        mother.childOutOfSchool("11 часов", "машине");
        children1.childrenPlay("играть");
        System.out.println();
        children2.chldrenPlay("Магнитный конструктор", "Собирать пазлы", "Лего");
        System.out.println("-_-_-_-_-_-_-_-_-_-_- РАБОТА С ИНТЕРФЕЙСАМИ-_-_-_-_-_-_-_-_-_-_- ");
        System.out.println();

        obj.childrenToSchool("9");
        obi = obj;
        obi.childrenToSchool("10");
        obj_1.goingToWork();
        obj_1.drivingFromWork();
        obj_1.childOutOfSchool();
        obj.childOutOfSchool();
        System.out.println();
        System.out.println("-_-_-_-_-_-_-_-_-_-_- РЕАЛИЗАЦИЯ НАСЛЕДОВАНИЯ ИНТЕРФЕЙСА-_-_-_-_-_-_-_-_-_-_- ");
        System.out.println();
        obj_2.GameLove();
        System.out.println("-_-_-_-_-_-_-_-_-_-_- РЕАЛИЗАЦИЯ c ДЕФОЛТОМ-_-_-_-_-_-_-_-_-_-_- ");
        int uId = Father.idChildUniversal();
        System.out.println("Универсальный ID " + uId);
        System.out.println("Id " + obj_3.idChild());
        System.out.println(("Id " + obj_3.childID()));










    }
}
