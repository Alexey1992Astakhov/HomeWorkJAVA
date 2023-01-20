package HomeWork07_OOP;

public class Generalization<T, V, S> {

    T id;
    V age;
    S name;

    public T getId() {
        return id;
    }
    public V getAge() {
        return age;
    }

    public void setAge(V age) {

        this.age = age;
    }

    Generalization(T id, V age, S name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    void printShow() {
        System.out.println(name + " в " + age + " лет" + " вышел на работу");
    }
}