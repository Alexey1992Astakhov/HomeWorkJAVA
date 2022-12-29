package HomeWork07_OOP;

public class GenericMethods {

    public <T> void printShows(T[] items) {
        for (T item : items) {
            System.out.print(item + ", ");
        }
    }
}
