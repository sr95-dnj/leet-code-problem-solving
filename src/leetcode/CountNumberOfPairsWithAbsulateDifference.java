package leetcode;

public class CountNumberOfPairsWithAbsulateDifference {

    public static void main(String[] args) {
        int k = 1;
        int[] nums = {1,2,2,1};
        System.out.println(countKDifference(nums, k));
    }


    public static int countKDifference(int[] nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if ((nums[i] - nums[j] == k) || (nums[j] - nums[i] == k)) {
                    res = res + 1;
                }
            }
        }
        return res;
    }
}
