package leetcode;

public class ValidPlindome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam madam"));
    }

    public static boolean isPalindrome(String s) {
        String a = s.replaceAll(" ","");
        String b = a.replaceAll("[^a-zA-Z\\d\\s]","").toLowerCase();
        String temp ="";
        for(int i=b.length()-1; i>=0; i--) {
            temp = temp + b.charAt(i);
        }
        if(b.equals(temp)) return true;
        else return false;
    }
}
