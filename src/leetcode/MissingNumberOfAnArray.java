package leetcode;

import java.util.Arrays;

public class MissingNumberOfAnArray {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 5, 6};

        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != i+1) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
