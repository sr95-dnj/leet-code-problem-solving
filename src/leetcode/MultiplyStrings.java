package leetcode;

import java.math.BigInteger;

public class MultiplyStrings {

    public static void main(String[] args) {
        multiply("498828660196",
                "840477629533");
    }

    public static String multiply(String num1, String num2) {

//        long s1 = Long.parseLong(num1);
//        long s2 = Long.parseLong(num2);
//
//        long s3 = s1 * s2;
//        String output = String.valueOf(s3);
//        System.out.println(output);
//
//        return output;

        if(num1.equals("0") || num2.equals("0")) return "0";

        int[] res = new int[num1.length() + num2.length()];

        int i = num2.length()-1;
        int pf = 0;

        while(i >= 0){
            int ival = num2.charAt(i)-'0';
            i--;
            int j = num1.length()-1;

            int k = res.length-1-pf;
            int carry = 0;

            while(j >= 0 || carry != 0){
                int jval = j >= 0 ?  num1.charAt(j)-'0' : 0;
                j--;

                int product = ival*jval + carry + res[k];
                res[k] = product%10;
                carry = product / 10;
                k--;
            }
            pf++;
        }

        String str = "";
        boolean flag = false;

        for(int val : res){
            if(val == 0 && flag == false) continue;
            else {
                flag = true;
                str += val;
            }
        }
        return str;

    }
}
