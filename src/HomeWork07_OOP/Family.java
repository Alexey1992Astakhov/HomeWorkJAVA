package HomeWork07_OOP;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Family {
    String fio;
    Integer age;
    String gender;
    String weight;
    Integer idNum;

    public Family(String fio, Integer age, String gender, Integer idNum, String weigth) {
        this.fio = fio;
        this.age = age;
        this.gender = gender;
        this.idNum = idNum;
        this.weight = weigth;
    }

    public Family() {
    }

    public void greeting(String msg) {
        System.out.println("Привет, меня зовут " + getFio() + msg);
    }

    public void childToSchool(String time) {
        System.out.println(getFio() + " отвез детей в школу к " + time);
    }

    public void childOutOfSchool(String time,String auto){
        System.out.println(getFio() + " забрала детей со школы в " + time + " на " + auto);
    }

    public void childrenPlay(String game) {
        System.out.println("Дети любят " + game + " в игры");
    }

    public void chldrenPlay(String... games) {
        System.out.println("Дети любят играть в игры: ");
        for(String game : games) {
            System.out.println(game);
        }
    }


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer newAge) {
        age = newAge ;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getIdNum() {
        return idNum;
    }

    public void setIdNum(Integer idNum) {
        this.idNum = idNum;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "Family{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                ", idNum=" + idNum +
                '}';
    }
}


