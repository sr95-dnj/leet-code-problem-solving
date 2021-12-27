package leetcode;

public class LengthLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        int n = s.length() - 1;
        while (s.charAt(n) == ' ') {
            n--;
        }

        for (int i = n; i >= 0; i--) {
            if (s.charAt(i) != ' ')
                count++;
            else
                break;

        }
        return count;

    }
}
