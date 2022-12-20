package HomeWork07_OOP;

public class TestClass implements MyChildren {
    String nameChild;
    String game;

    TestClass(){
        nameChild = "";
        game = "";

    }

    @Override
    public void childrenToSchool(String time) {

    }

    @Override
    public void goingToWork() {

    }

    @Override
    public void drivingFromWork() {

    }

    @Override
    public void childOutOfSchool() {

    }

    @Override
    public int childID() {
        return 0;
    }

    @Override
    public int idChild() {
        return MyChildren.super.idChild();
    }

    @Override
    public void GameLove() {

        nameChild = "Андрей";
        game = "магнитный конструктор";

        System.out.println(nameChild + " любит играть в " + game);
    }
}

