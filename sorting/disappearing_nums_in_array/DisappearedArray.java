package disappearing_nums_in_array;

import java.util.ArrayList;
import java.util.List;

public class DisappearedArray {

    public static void main(String[] args) {

        int[] nums = new int[] { 1, 1 };
        List<Integer> missingNums = findDisappearedNumbers(nums);
        System.out.println("Missing Nums: " + missingNums);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> missingNums = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int correctedPostion = nums[i] - 1;

            if (i == correctedPostion || nums[i] == nums[correctedPostion]) // or we can use arr[i] == arr[correctedPosition]
            {
                continue;
            } else {
                int k = nums[i];
                nums[i] = nums[correctedPostion];
                nums[correctedPostion] = k;
                i--;
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if (nums[i - 1] != i) {
                missingNums.add(i);
            }
        }

        return missingNums;
    }
}
