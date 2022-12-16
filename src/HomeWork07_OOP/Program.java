package HomeWork07_OOP;

public class Program {
    public static void main(String[] args) {
        Parents father = new Parents("Астахов Алексей Андреевич", 30, "мужской", 1, "70 кг.", "Будущий программист","Писать код");
        Parents mother = new Parents("Астахова Екатерина Вадимовна", 27, "женский", 2, "45 кг.","Домохозяйка", "");
        Children children1 = new Children("Астахов Андрей Алексеевич", 7, "мужской", 3, "22 кг.");
        Children children2 = new Children("Астахов Кирилл Алексеевич", 5, "мужской", 4, "18 кг.");
        children2.greeting("");
        father.setFio("Папа");
        father.childToSchool("8 часам");
        mother.setFio("Мама");
        mother.childOutOfSchool("11 часов", "машине");
        children1.childrenPlay("играть");
        System.out.println();
        children2.chldrenPlay("Магнитный конструктор", "Собирать пазлы", "Лего");



    }
}
