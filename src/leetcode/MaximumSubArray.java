package leetcode;

public class MaximumSubArray {

    public static void main(String[] args) {
        int[] a = {5,4,-1,7,8};
        System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(a));
    }

    static int maxSubArraySum(int a[]) {
        int size = a.length;
        int max_start = Integer.MIN_VALUE, max_end = 0;

        for (int i = 0; i < size; i++) {
            max_end = max_end + a[i];
            if (max_start < max_end)
                max_start = max_end;
            if (max_end < 0)
                max_end = 0;
        }
        return max_start;
    }
}
