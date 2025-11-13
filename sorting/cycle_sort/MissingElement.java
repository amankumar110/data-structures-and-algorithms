package cycle_sort;

import java.util.Arrays;

public class MissingElement {

    public static void main(String[] args) {

        int[] nums = {9,6,4,2,3,5,7,0,1};
        int missing = missingNumber(nums);
        System.out.println("Missing: " + missing);
    }

    public static int missingNumber(int nums[]) {


        int n = Integer.MIN_VALUE;

        for(int i=0; i<=nums.length-1; i++) {
            if(nums[i] > n) {
                n = nums[i];
            }
        }

        boolean lastElementDisplaced = false;

        for (int i = 0; i < nums.length; i++) {

            if (i == nums.length - 1 && lastElementDisplaced) {
                continue;
            }

            if (nums[i] >= n) {
                // swap with last element;
                int k = nums[i];
                nums[i] = nums[nums.length - 1];
                nums[nums.length - 1] = k;
                lastElementDisplaced = true;
                i--;
            } else if (i != nums[i]) {
                // swap with correct position;
                int k = nums[i];
                nums[i] = nums[k];
                nums[k] = k;
                i--; // for again checking in next iteration.
            } else {
                continue;
            }

        }

        for(int finder=0; finder<=n; finder++) {
            if(nums[finder] != finder) {
                return finder;
            }
        }

        return n;
    }

}
