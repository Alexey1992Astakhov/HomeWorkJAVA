package homeWork03;

import java.util.ArrayList;
import java.util.List;

public class RemoveAll {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(8);
        list1.add(10);
        list1.add(9);
        list1.add(12);
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(12);
        list2.add(8);
        System.out.println(list2);

        list1.removeAll(list2);
        System.out.println(list1);
    }
}
