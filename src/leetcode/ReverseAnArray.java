package leetcode;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr =new int[]{1, 3, 4, 5, 6, 6, 6, 7, 8, 9};
        System.out.println("the original array is.......");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("the reverse array is.......");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
