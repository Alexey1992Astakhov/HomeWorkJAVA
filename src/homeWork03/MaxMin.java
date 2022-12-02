package homeWork03;
import java.util.ArrayList;
import java.util.Collections;

public class MaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(34);
        list.add(145);
        list.add(85);
        list.add(69);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
