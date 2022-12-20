package HomeWork07_OOP;

public class Realistaion_1 implements Father {

    String namePap;
    String idNum;
    String nameMom;

    String time;
    String auto;


    Realistaion_1() {
        namePap = "";
        nameMom = "";
        idNum = "";
        time = "";
        auto = "";

    }

    @Override
    public void childrenToSchool(String time) {



    }

    @Override
    public void goingToWork() {
        time = "9 часов утра";
        namePap = "Отец";

        System.out.println(namePap + " уезжает на работу в " + time);

    }

    @Override
    public void drivingFromWork() {
        time = "6 часов вечера";
        namePap = "Папа";

        System.out.println(namePap + " приезжает с работы в " + time);

    }

    @Override
    public void childOutOfSchool() {
        nameMom = "Мама";
        time = "час дня";
        auto = "на машине";

        System.out.println(nameMom + " забирает детей со школы в " + time + " " + auto);

    }

    @Override
    public int childID() {
        return 0;
    }

    @Override
    public int idChild() {
        return Father.super.idChild();
    }
}
