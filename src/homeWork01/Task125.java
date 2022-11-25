package homeWork01;

public class Task125 {
    public static void main(String[] args) {
        String stringFirst = "A man, a plan, a canal: Panama";
        String stringSecond = "race a car";

        System.out.println(isPalindrome(stringSecond));
        System.out.println(isPalindrome(stringFirst));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char leftChar;
        char rightChar;

        while (left <= right) {
            leftChar = s.charAt(left);
            rightChar = s.charAt(right);
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
