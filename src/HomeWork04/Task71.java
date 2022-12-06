package HomeWork04;

import java.util.Stack;

public class Task71 {
    public static void main(String[] args) {
        class Solution {
            public String simplifyPath(String path) {
                final String[] DIRECTIONS = path.split("/");
                Stack<String> q = new Stack<>();

                for (final String dir : DIRECTIONS) {
                    if (dir.isEmpty() || dir.equals("."))
                        continue;
                    if (dir.equals("..")) {
                        if (!q.isEmpty())
                            q.pop();
                    } else {
                        q.push(dir);
                    }
                }

                return "/" + String.join("/", q);
            }
        }
    }
}
