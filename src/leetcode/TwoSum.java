package leetcode;

public class TwoSum {

    static int[] targetSum(int []a , int target)
    {
        for(int i = 0 ; i < a.length - 1 ; i++)
            for(int j = i + 1 ; j < a.length ; j++)
            {
                if(a[i] + a[j] == target)
                    return new int[]{i + 1 , j + 1};
            }
        return new int[]{-1 , -1};
    }
    public static void main(String args[])
    {
        int [] a = {1 , 7 , 2 , 15};
        int target = 17;
        for(int x : targetSum(a , target))
            System.out.print(x + " ");
    }
}
