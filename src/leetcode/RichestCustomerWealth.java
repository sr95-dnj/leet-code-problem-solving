package leetcode;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(sum>res){
                res = sum;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 3, 4 } };
        System.out.println(maximumWealth(arr));
    }
}
