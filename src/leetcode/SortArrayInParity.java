package leetcode;

public class SortArrayInParity {

    public static void main(String[] args) {

    }

    public static int[] sortArrayByParity(int[] nums) {

        int s=0;
        int low=0;
        while(s<nums.length){
            if (nums[s]%2==0){
                int temp=nums[low];
                nums[low]=nums[s];
                nums[s]=temp;
                low++;

            }
            s++;
        }
        return nums;
    }

    public static int[] sortArrayByParityWay2(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]%2==0 && nums[j]%2!=0){
                i++;
                j--;
            }
            else if(nums[i]%2==0 && nums[j]%2==0){
                i++;
            }
            else if(nums[i]%2!=0 && nums[j]%2!=0){
                j--;
            }
            else{
                int a=nums[i];
                nums[i]=nums[j];
                nums[j]=a;
                i++;
                j--;
            }

        }
        return nums;
    }
}
