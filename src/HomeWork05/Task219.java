package HomeWork05;

import java.util.HashSet;
import java.util.Set;

public class Task219 {
    public static void main(String[] args) {
        class Solution {
            public boolean containsNearbyDuplicate(int[] nums, int k) {
                Set<Integer> set = new HashSet<>();

                for (int i = 0; i < nums.length && i <= k; i++) {
                    if (!set.add(nums[i])) {
                        return true;
                    }
                }

                for (int i = k + 1; i < nums.length; i++) {
                    set.remove(nums[i - k - 1]);
                    if (!set.add(nums[i])) {
                        return true;
                    }
                }
                return false;

            }
        }
    }
}
