package Lesson_OOP;

public class Human {
    String firstName;
    String lastName;
    int age;
    String country;
    String gender;

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    Integer parent;
    Integer idPerson;
    String appeal;

    public Human() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.country = "";
        this.gender = "";
        this.parent = null;
        this.idPerson = null;

    }

    public Human(String firstName, String lastName, Integer idPerson) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idPerson = idPerson;
    }

    public void greetings(String msg) {
        System.out.println(msg);
    }

    public void printInfo() {
        System.out.println(printString());
    }

    public String apper() {
        return "Он ";
    }

    private String printString() {
        return apper() + "Human" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                ", parent=" + parent +
                ", idPerson=" + idPerson +
                '}';
    }
}

