package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringSuffle {

    public static  String restoreString(String s, int[] indices) {
        StringBuilder shuffles = new StringBuilder(s);
        System.out.println(shuffles);
        for(int i =0; i < indices.length; ++i)
            shuffles.setCharAt(indices[i],s.charAt(i));
        return shuffles.toString();
    }
    public static void main(String[] args) {
        String s="cba";
        int [] arr = {2,1,0};
        String ans=  restoreString(s,arr);
        System.out.println(ans);
    }
}
