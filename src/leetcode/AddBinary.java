package leetcode;

public class AddBinary {
    public static void main(String[] args) {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        System.out.print(addBinary(a, b));
    }

    public static String addBinarys() {
        String input0 = "11";
        String input1 = "1";
        int number0 = Integer.parseInt(input0, 2);
        int number1 = Integer.parseInt(input1, 2);

        int sum = number0 + number1;
        return Integer.toBinaryString(sum);
    }


    //Driver code
    static String addBinary(String a, String b) {
        String result = "";
        int s = 0;
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || s == 1) {
            s += ((i >= 0) ? a.charAt(i) - '0' : 0);
            s += ((j >= 0) ? b.charAt(j) - '0' : 0);
            result = (char) (s % 2 + '0') + result;
            s /= 2;
            i--;
            j--;
        }
        return result;
    }

}
