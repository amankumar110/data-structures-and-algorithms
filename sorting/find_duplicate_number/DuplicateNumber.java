package find_duplicate_number;

import java.util.*;

public class DuplicateNumber {

    public static List<Integer> findDuplicates(int[] nums) {

        HashSet<Integer> dupsSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            int correctPosition = nums[i] - 1;

            if (correctPosition != i) {

                if (nums[correctPosition] == nums[i]) {
                    dupsSet.add(nums[i]);
                } else {
                    // swap
                    int k = nums[i];
                    nums[i] = nums[correctPosition];
                    nums[correctPosition] = k;
                    i--;
                }

            }

        }

        return new ArrayList<>(dupsSet);
    }

    public static List<Integer> findDuplicates2(int[] nums) {


        List<Integer> duplicates = new ArrayList<>();
        
        for(int i=0;i<nums.length; i++) {
        
            int correctPos = nums[i]-1;

            if(i != correctPos && nums[correctPos] != nums[i]) {

                int k = nums[i];
                nums[i] = nums[correctPos];
                nums[correctPos] = k;
                i--;
            }
        }

        for(int finder=1; finder<=nums.length; finder++) {
            if(nums[finder-1] != finder) {
                duplicates.add(nums[finder-1]);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        List<Integer> dups = findDuplicates2(new int[]{4,3,2,7,8,2,3,1});
        System.out.println("Dupes: "+dups);
    }
}
