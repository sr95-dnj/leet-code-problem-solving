package leetcode;

public class RunningSumOfOneDArray {

    public static void main(String[] args) {
        int[] ints = runningSum(new int[]{1, 1, 3, 4});
        for(int n : ints){
            System.out.print(n);
        }
    }

    public static int[] runningSum(int[] nums) {

        int[] res = new int[nums.length] ;

        res[0] = nums[0];
        for(int i = 1; i< nums.length; i++){
            res[i] =  res[i-1] + nums[i];
        }
        return res;
    }

//    public static int[] runningSum(int[] nums) {
//        int[] sum = new int [nums.length];
//        sum [0] = nums[0];
//        for(int i = 1; i <nums.length; i++ ){
//            sum [i] = sum[i-1]+nums[i];
//
//        }
//        return sum;
//    }
}
