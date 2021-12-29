package leetcode;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 6};
        int[] arrays = {1, 3, 5, 4, 5, 6, 6};
        int[] arrayss = {1, 2, 3, 5, 4, 5, 6, 6};
        int target = 6;
        // way 2
        System.out.println(searchInsert(array, target));
        // way 1
        System.out.println(searchInserte(arrays, target));
        // way 3
        System.out.println(searchInserts(arrayss, target));
    }


    // way 1...............
    public static int searchInserte(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;

        while(i<=j){
            int mid = (i+j)/2;

            if(target > nums[mid]){
                i=mid+1;
            }else if(target < nums[mid]){
                j=mid-1;
            }else{
                return mid;
            }
        }

        return i;
    }


    // way 2.................
    public static int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    // way 2..............
    private static int binarySearch(int[] nums, int start, int end, int target) {
        if (start >= end) {
            if (target > nums[start]) {
                return start + 1;
            } else {
                return start;
            }
        }

        int mid = (end + start) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return binarySearch(nums, start, mid - 1, target);
        } else {
//            System.out.println(binarySearch(nums, mid + 1, end, target));
            return binarySearch(nums, mid + 1, end, target);
        }
    }


    // way 3....................
    public static int searchInserts(int[] nums, int target) {
        if(target>nums[nums.length-1]){
            return nums.length;
        }

        int l=0;
        int r=nums.length-1;

        while(l<r){
            int m = l+(r-l)/2;
            if(target>nums[m]){
                l=m+1;
            }else{
                r=m;
            }
        }

        return l;
    }
}
