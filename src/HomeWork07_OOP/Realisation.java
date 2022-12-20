package HomeWork07_OOP;

public class Realisation implements Father{

    String namePap;
    String agePapa;
    String idNum;
    String nameMom;
    String ageMama;
    String time;


    Realisation() {
        namePap = "";
        nameMom = "";
        agePapa = "";
        ageMama = "";
        idNum = "";
        time = "";

    }

    @Override
    public void childrenToSchool(String time) {
        namePap = "Папа";
        System.out.println(namePap + " отвез детей в школу к " + time);
    }

    @Override
    public void goingToWork() {
        namePap = "Папа";
        agePapa = "30";

    }

    @Override
    public void drivingFromWork() {
        namePap = "Папа";
        agePapa = "30";

    }

    @Override
    public void childOutOfSchool() {
        ageMama = "27";
        nameMom = "Мама";
        time = "12 часов дня";
        System.out.println(nameMom + " забирает детей со школы в " + time);

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

