package leetcode;

import java.util.HashSet;

public class FindSingleSingleNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,5,3,4,4,3};
        int i = singleNumber(nums);
        System.out.println(i);
    }

    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) set.remove(num);
            else set.add(num);
        }
        return set.iterator().next();
    }
}
