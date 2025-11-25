package two_array_intersection;

import java.util.*;

public class TwoArrayIntersection {

    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> nums = new HashSet<>();
    
        bubbleSort(nums1);
        bubbleSort(nums2);
        int i=0,j=0;

        while(i<nums1.length && j<nums2.length) {

            if(nums1[i] == nums2[j]) {
                nums.add(nums1[i]);
                i++;
                j++;
            } else if(nums1[i] < nums2[j]) {
                i++;
            } else if(nums1[i] > nums2[j]) {
                j++;
            }

        }


        int[] numsArray = new int[nums.size()];
        int numsSize=0;
        for(int el : nums)
            numsArray[numsSize++] = el;

        return numsArray;

    }

    public static void bubbleSort(int[] nums) {


        for(int i=0; i<nums.length; i++) {
        
            boolean hasSwapped = false;

            for(int j=1; j<nums.length-i;j++) {
                if(nums[j] < nums[j-1]) {
                    int t = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = t;
                    hasSwapped=true;
                }
            }

            if(!hasSwapped)
                break;
        }
    }
}