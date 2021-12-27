package leetcode;

public class DevidedTwoIntegers {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(devidedTwoInteger(a, b));

        a = -2147483648;
        b = -1;

        System.out.println(devidedTwoInteger(a, b));
    }

    public static int devidedTwoInteger(int d, int num) {

        if (d == Integer.MIN_VALUE && num == -1) return Integer.MAX_VALUE;
        if (d == Integer.MIN_VALUE && num == 1) return Integer.MIN_VALUE;

        int sign = (d < 0) ^ (d < 0) ? -1 : 1;
        d = Math.abs(d);
        num = Math.abs(num);
        int ans = 0;
        while (d >= num) {
            d -= num;
            ++ans;
        }
        if (sign == -1) {
            ans = -ans;
        }
        return ans;
    }


}
