package Lesson_OOP;

public class Male extends Human {

    public Male(String firstName, String lastName, Integer idPerson) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idPerson = idPerson;
    }
    @Override
    public String apper() {
        return "Он ";
    }
}
