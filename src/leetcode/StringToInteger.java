package leetcode;

public class StringToInteger {
    public static void main(String[] args) {

        System.out.println(myAtoi("1221 323 121 hello java"));

    }
    public static int myAtoi(String s) {

        int i=0, l=s.length(), sign=1, res=0;

        if (s.length() == 0) return 0;
        while(i<l && s.charAt(i)==' ')
            i++;
        if(i<l && (s.charAt(i)=='-' || s.charAt(i)=='+') )
        {
            sign  = (s.charAt(i)=='-')?-1:1;
            i++;
        }
        while(i<l && s.charAt(i)>='0' && s.charAt(i)<='9')
        {
            if(res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && s.charAt(i)-'0'>7))
                return (sign==-1)?Integer.MIN_VALUE:Integer.MAX_VALUE;
            res=10*res+(s.charAt(i)-'0');
            i++;
        }
        return sign*res;
    }


}
