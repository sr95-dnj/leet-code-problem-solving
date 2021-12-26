package leetcode;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {
        boolean isNeg = x < 0 ? true: false;
        int res = 0;
        x = Math.abs(x);
        System.out.println(Math.abs(x));
        while(x>0) {
            if(res>Integer.MAX_VALUE/10) return 0;
            res = res*10 + x%10;
            x /= 10;
            if(res < 0) return 0;
        }
        res = isNeg ? -1 * res : res;

        return res;
    }
}
