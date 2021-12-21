package leetcode;

public class IntPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        int isPalindrome = x;
        if (x < 0) return false;

        long reverse = 0;
        while (x >= 10) {
            reverse = reverse*10 + x%10;
            x /= 10;
        }
        reverse = reverse * 10 + x;
        return reverse == isPalindrome;

    }
}
