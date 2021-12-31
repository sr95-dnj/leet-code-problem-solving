package leetcode;

public class PlusOneArrayLastIndex {
    public static void main(String[] args) {
        int[] nums = {9};
        int[] ints = plusOne(nums);
        for (int i : ints){
            System.out.println(i);
        }
    }

    public static int[] plusOne(int[] digits) {
        int j = digits.length - 1;
        int n = j;
        int length = digits.length;
        for (int i = j; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] number = new int[digits.length + 1];
        number[0] = 1;
        return number;
    }
}
