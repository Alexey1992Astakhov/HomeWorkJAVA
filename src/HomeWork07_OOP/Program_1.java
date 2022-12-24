package HomeWork07_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program_1 {
    public static void main(String[] args) {

        List<Relations> relative = new ArrayList<>();

        Relations granny = new Relations("Валентина", 73, "женский");
        Relations grandpa = new Relations("Валентин", 75, "мужской");
        Relations sister = new Relations("Анастасия", 31, "женский");
        Relations brother = new Relations("Иван", 29, "мужской");

        relative.add(granny);
        relative.add(grandpa);
        relative.add(sister);
        relative.add(brother);

        Collections.sort(relative);
        System.out.println(relative);





    }
}
