package homeWork01;

public class Task151 {
    public static void main(String[] args) {
        String stringFirst = "the sky is blue";
        String stringSecond = "a good   example";

        System.out.println(reverseWords(stringFirst));
        System.out.println(reverseWords(stringSecond));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            if (i < 0) break;
            if (sb.length() != 0) sb.append(' ');
            StringBuilder w = new StringBuilder();
            while (i >= 0 && s.charAt(i) != ' ') w.append(s.charAt(i--));
            sb.append(w.reverse());
        }

        return sb.toString();
    }
}
