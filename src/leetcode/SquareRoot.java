package leetcode;

public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(mySqrt(45));
        System.out.println(mySqrts(45));
    }

    // way 1
    public static int mySqrt(int x) {
        if(x<2) return x;
        int start =0,end = x;
        while(start<end){
            int mid = start + (end - start)/2;
            int mul = x/mid;
            if(mul==mid) return mid;
            if(mul<mid){
                end = mid;
            }else{
                start = mid+1;
            }
        }

        return start-1;

    }

    // way 2------> use Math library
    public static int mySqrts(int x) {
        return ((int)Math.sqrt(x));
    }
}
