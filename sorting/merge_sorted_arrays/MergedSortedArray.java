import java.util.*;
import java.util.Arrays;
import java.util.HashMap;

public class MergedSortedArray {

    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = new int[] { 2, 5, 6 };
        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0, j = 0;

        int[] merged = new int[m + n];
        int mergedsize = 0;

        while (i < m || j < n) {

            if (i >= m) {
                merged[mergedsize++] = nums2[j];
                j++;
            } else if (j >= n) {
                merged[mergedsize++] = nums1[i];
                i++;
            } else if (nums1[i] < nums2[j]) {

                merged[mergedsize++] = nums1[i];
                i++;
            } else if (nums1[i] > nums2[j]) {
                merged[mergedsize++] = nums2[j];
                j++;
            } else {
                merged[mergedsize++] = nums1[i];
                merged[mergedsize++] = nums2[j];
                i++;
                j++;
            }
        }

        for (int k = 0; k < (m + n); k++) {
            nums1[k] = merged[k];
        }
    }

    public int[] intersect(int[] nums1, int[] nums2) {

        int i=0,j=0;
        List<Integer> list = new ArrayList<>();

        while(i<nums1.length && j<nums2.length) {

            if(nums1[i] > nums2[j]) {
                j++;
            } else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                
            }

        }
    }



}