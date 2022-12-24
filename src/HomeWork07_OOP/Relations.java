package HomeWork07_OOP;

public class Relations implements Comparable<Relations> {
    String name;
    Integer age;
    String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Relations{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Relations(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;


    }

    @Override
    public int compareTo(Relations o) {
        return this.getAge() - o.getAge();
    }
}

