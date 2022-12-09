package HomeWork05;

import java.util.HashMap;
import java.util.Map;

public class Task13 {
    public static void main(String[] args) {

        class Solution {
            public int romanToInt(String s) {
                char[] sChar = s.toCharArray();
                Map<Character, Integer> romanMap = new HashMap<>();
                romanMap.put('I', 1);
                romanMap.put('V', 5);
                romanMap.put('X', 10);
                romanMap.put('L', 50);
                romanMap.put('C', 100);
                romanMap.put('D', 500);
                romanMap.put('M', 1000);

                int sum = 0;

                for (int i = 0; i < s.length() - 1; i++) {
                    if ((romanMap.get(sChar[i + 1]) <= romanMap.get(sChar[i]))) {
                        sum = sum + romanMap.get(sChar[i]);
                    } else {
                        sum = sum - romanMap.get(sChar[i]);
                    }
                }

                return sum + romanMap.get(sChar[s.length() - 1]);
            }
        }
    }
}
