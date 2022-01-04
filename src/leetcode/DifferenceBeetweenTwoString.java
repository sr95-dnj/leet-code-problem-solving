package leetcode;

import java.util.Arrays;

public class DifferenceBeetweenTwoString {

    public static void main(String[] args) {
//        System.out.println(findDifference("ab", "abv"));
//        System.out.println(findDifferenceWayTwo("abbb", "abd"));
        System.out.println(findDifferenceTwoString("ab", "abd"));
    }

    public static char findDifferenceTwoString(String s, String t){
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        for(int i=0; i< s.length(); i++){
            if(s1[i] != t1[i]){
                return t1[i];
            }
        }
        return t1[s.length()];
    }

    public static char findDifference(String s, String t){
        int res = 0;
        for(char c : s.toCharArray()){
            res ^= c;
        }
        for(char c : t.toCharArray()){
            res ^= c;
        }
        return (char)res;
    }

    public static char findDifferenceWayTwo(String s, String t){
        int res_s = 0;
        int res_t = 0;

        for(char c : s.toCharArray()){
            res_s += c;
        }
        for(char c : t.toCharArray()){
            res_t += c;
        }
        return (char)(res_t - res_s);
    }
}
