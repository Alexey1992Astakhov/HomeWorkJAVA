package RedBlackTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        final RedBlackTreeTask tree = new RedBlackTreeTask();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                try {
                    int value = Integer.parseInt(reader.readLine());
                    tree.add(value);
                    System.out.println(" FINISH ");
                } catch (Exception ignored) {

                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}