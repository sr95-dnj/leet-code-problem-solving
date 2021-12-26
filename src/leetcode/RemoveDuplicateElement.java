package leetcode;

public class RemoveDuplicateElement {

    public static int removeduplicates(int nums[], int val)
    {
        int length = nums.length;
        if(length==0 || length == 1){
            return 0;
        }
        int res=0;
        for(int i=0;i<length;i++){
            if(nums[i]!=val){
                nums[res++]=nums[i];
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        int a[] = { 1, 1, 2, 2, 2 };
        int n = 2;

        n = removeduplicates(a, n);

        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
