package HomeWork_Algoritms;

import java.util.Random;

public class app {
    static int[] values = {1, 9, 2, 8, 3, 7, 4, 6, 5, 10, 20, 15, 17};
    static int k;

    static public void main(String[] args) {
        Node root = new Node();
        root = BuildBalanceTree(10);
        System.out.println(isBalance(root));
        System.out.println();
        printTree(root, "");
    }

    static void printTree(Node tree, String sp) {
        if (tree != null) {
            System.out.println(sp + tree.value);
            printTree(tree.left, sp + "  ");
            printTree(tree.right, sp + "  ");
        }
    }

    static int high(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(high(root.left), high(root.right));
    }

    static boolean isBalance(Node root) {
        int i = 0;
        if (root == null) {
            return true;
        }
        i = Math.abs(high(root.left) - high(root.right));
        if (i < 2) {
            return true;
        } else {
            return false;
        }
    }

    static Node BuildBalanceTree(int count) {
        Node root;
        if (count <= 0) {
            return null;
        } else {
            root = new Node();
            root.value = new Random().nextInt(30);
            root.left = BuildBalanceTree(count / 2);
            root.right = BuildBalanceTree(count / 2 - 1);
        }
        return root;
    }

    static class Node {
        int value;
        Node left;
        Node right;
    }
}

