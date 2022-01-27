package leetcode;

public class BuildAnArrayPermulation {
    public static int[] buildArray(int[] nums) {
        int[] ret = new int[nums.length];
        for(int i = 0; i < nums.length; i ++){
            ret[i] = nums[nums[i]];
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] ints = {0,2,1,5,3,4};
        int[] arr = buildArray(ints);
        for(int k : arr){
            System.out.print(k);
        }
    }
}
