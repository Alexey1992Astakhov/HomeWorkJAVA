package homeWork01;

public class Task27 {
    public static void main(String[] args) {

        System.out.println();

    }
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }

}

