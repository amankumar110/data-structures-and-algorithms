package assign_cookies;

import java.util.Arrays;

public class AssignCookies {

    public static void main(String[] args) {

        int[] g = new int[] { 7, 1, 3, 10, 2};
        int[] s = new int[] {5, 2, 20, 1, 6};
        System.out.println("HK: " + findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        
        bubbleSort(g);
        bubbleSort(s);
        int happyKids = 0;
        int start=0;

        for(int i=0; i< g.length; i++) {
            int ceilIndex = ceilIndex(s, g[happyKids], start);

            if(ceilIndex == -1) {
                break;
            } else {
                start = ceilIndex+1;
                happyKids++;
            }
        }

        return happyKids;

    }

    public static void bubbleSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = 1; j < nums.length - i; j++) {

                if (nums[j] < nums[j - 1]) {
                    int k = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = k;
                }
            }

        }
    }

    public static int ceilIndex(int[] arr, int num, int left) {
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= num) {
                result = mid; // possible ceil, try to find smaller one
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

}
