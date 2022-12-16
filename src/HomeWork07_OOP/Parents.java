package HomeWork07_OOP;

public class Parents extends Family{
    String work;
    String hobby;
    public Parents(String fio, Integer age, String gender, Integer idNum, String weigth, String work, String hobby) {
        super(fio, age, gender, idNum, weigth);
        this.work = work;
        this.hobby = hobby;

    }


    public void greeting() {
        System.out.println("Привет меня зовут" + getFio());
    }

    @Override
    public String toString() {
        return "Parents{" +
                "work='" + work + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
