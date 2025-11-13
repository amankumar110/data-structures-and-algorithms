package cycle_sort;

import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {

        int[] arr = { 1, 5, 2, 4, 3 };

        // It is only good for non duplicate values and ranging from 1 to n in a
        // continous and non-skipped manner.
        cycleSort(arr);

        System.out.println("Sorted : " + Arrays.toString(arr));
    }

    public static void cycleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (i != arr[i] - 1) {
                int k = arr[i];
                arr[i] = arr[k - 1];
                arr[k - 1] = k;
                i--; // recehcks Ith Element in the next iteration.
            }
        }
    }
}
