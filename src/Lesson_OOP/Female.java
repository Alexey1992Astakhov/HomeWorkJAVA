package Lesson_OOP;

public class Female extends Human {
    public Female(String firstName, String lastName, Integer idPerson) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idPerson = idPerson;
    }
    @Override
    public String apper() {
        return "Она ";
    }

}
