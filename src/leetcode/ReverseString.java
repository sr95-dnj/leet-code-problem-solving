package leetcode;

public class ReverseString {
    public static void main(String[] args) {

        char[] c ={'h','e','l','l','o'};

    }

    public static void reverseString(char[] s){
        int start=0;
        int end = s.length-1;

        for(start=0;start<end;start++)
        {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            end--;

        }
    }
}
