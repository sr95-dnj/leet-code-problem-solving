package leetcode;

public class InterleavingString {

    public static void main(String[] args) {
        System.out.println(isInterleave("ab", "cd", "afbcd"));
    }

    public static boolean isInterleave(String s1, String s2, String s3) {

        String sr = s1 + s2;
        char c = 0;
        char d = 0;
        for(int i = 0; i<sr.length(); i++){
             c+= sr.charAt(i);
        }
        for(int i = 0; i<s3.length(); i++){
            d += s3.charAt(i);
        }
        if(c == d){
            return true;
        }

        return false;


    }
}
