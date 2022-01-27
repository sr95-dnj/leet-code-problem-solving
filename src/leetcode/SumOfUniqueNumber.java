package leetcode;

public class SumOfUniqueNumber {

    public static void main(String[] args) {

        System.out.println(getSum(234));
        int [] arr = {1,1,1,2,2,2,3,3,3,4,4,5,5,6,7,8,};



        int num = 0;

        for (int j= 0; j < arr.length; j++){
            int count1 = 0;
            for (int i = 0; i < arr.length; i++){
                if(arr[i] == arr[j] ) {
                    count1++;
                }
            }
            if(count1 == 1 ){

               int n = arr[j];
                int sum = 0;
                while (n != 0) {
                    sum = sum + n % 10;
                    n = n / 10;
                }
                System.out.print(sum);
            }
    }
    }


    public int sumOfUnique(int[] nums) {
        int val[] = new int[101];
        for(int i=0;i<nums.length;i++){
            val[nums[i]]++;
        }
        int sum =0;
        for(int i=1;i<nums.length;i++){
            if(val[i]==1)
                sum+= i;
        }
        return sum;
    }

    static int getSum(int n)
    {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }
}
