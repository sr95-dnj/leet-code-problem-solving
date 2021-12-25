package leetcode;

public class ConcatationArray {

    public static void main(String[] args) {

        int[] concatenation = getConcatenation(new int[]{2, 3, 4, 4});
        for (int element : concatenation){
            System.out.print(element);
        }
    }


    public static int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] result = new int[2 * n];
        for(int i = 0; i< n; i++){
            result[i] = nums [i];
            result[i+n] = nums[i];
        }
        return result;
    }
}
