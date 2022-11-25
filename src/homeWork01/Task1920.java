package homeWork01;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class Task1920 {
    public static void main(String[] args) {

        System.out.println();
    }
    public static int [] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}