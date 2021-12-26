package leetcode;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1,2,2,7};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int r = 0;
        int p = 0;

        while(p < nums.length) {
            if(nums[p] > nums[r]) {
                r++;
                nums[r] = nums[p];
            }
            p++;
        }
        return r + 1;
    }
}
