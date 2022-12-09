package HomeWork05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task350 {
    public static void main(String[] args) {

        class Solution {
            public int[] intersect(int[] nums1, int[] nums2) {
                if (nums1.length > nums2.length) {
                    return intersect(nums2, nums1);
                }

                Map<Integer, Integer> count = new HashMap<>();
                for (int num : nums1) {
                    count.put(num, count.getOrDefault(num, 0) + 1);
                }

                List<Integer> ans = new ArrayList<>();
                for (int num : nums2) {
                    if (count.containsKey(num) && count.get(num) > 0) {
                        ans.add(num);
                        count.put(num, count.get(num) - 1);
                    }
                }
                int[] outarr = new int [ans.size()];
                for (int i = 0; i < ans.size(); i++) {
                    outarr[i] = ans.get(i);
                }
                return outarr;
            }
        }
    }
}
