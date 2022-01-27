package leetcode;

public class SumOfBeautyOfAnArray {

    public int sumOfBeauties(int[] nums) {
        int len = nums.length;
        int[] rmin = new int[len + 1];
        rmin[len] = Integer.MAX_VALUE;

        for (int i = len - 1; i >= 0; i--)
            rmin[i] = Math.min(rmin[i + 1], nums[i]);

        int count = 0;
        for (int lmax = nums[0], i = 1; i < len - 1; i++) {
            if (lmax < nums[i] && nums[i] < rmin[i + 1])
                count += 2;
            else if (nums[i - 1] < nums[i] && nums[i] < nums[i + 1])
                count++;
            lmax = Math.max(lmax, nums[i]);
        }
        return count;
    }
}
