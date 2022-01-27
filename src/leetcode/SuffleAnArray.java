package leetcode;

public class SuffleAnArray {

    public static void main(String[] args) {
        int target = 3;
        int[] nums = new int[]{2,5,1,3,4,7};
        System.out.println(shuffle(nums, target));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int j =0;
        for (int i =0; i<n; i++)
        {
            ans[j]=nums[i];
            ans[++j]= nums[i+n];
            j++;
        }
        return ans;
    }
}
