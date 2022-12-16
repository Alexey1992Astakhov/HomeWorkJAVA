package HomeWork07_OOP;

public class Children extends Family {
    public Children(String fio, Integer age, String gender, Integer idNum, String weigth) {
        this.fio = fio;
        this.age = age;
        this.gender = gender;
        this.idNum = idNum;
        this.weight = weigth;
    }

    @Override
    public String toString() {
        return "MyChildren{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", weight='" + weight + '\'' +
                ", idNum=" + idNum +
                '}';
    }
}
