package maximum_product_three_numbers;

import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {

        int maxProduct = maximumProduct(new int[] { 1, 2, 3 });
        System.out.println("MP: " + maxProduct);
    }

    public static int maximumProduct(int[] nums) {
        bubbleSort(nums); // normal increasing sort

        int n = nums.length;

        int case1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int case2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(case1, case2);
    }

    public static void bubbleSort(int[] arr) {

        for (int count = 0; count < arr.length; count++) {

            boolean hasSwapped = false;

            for (int j = 1; j < arr.length - count; j++) {

                if (arr[j] < arr[j - 1]) {

                    int k = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = k;
                    hasSwapped = true;
                }
            }

            if (!hasSwapped)
                break;

        }
    }

}