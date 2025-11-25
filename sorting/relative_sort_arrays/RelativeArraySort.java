package relative_sort_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RelativeArraySort {

    public static void main(String[] args) {

        relativeSortArray(new int[] { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 }, new int[] { 2, 1, 4, 3, 9, 6 });
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> frequencies = new HashMap<>();
        HashMap<Integer, Integer> arr2Frequencies = new HashMap<>();
        int[] arr3 = new int[arr1.length];
        int arrSize = 0;

        for (int element : arr1)
            frequencies.put(element, frequencies.getOrDefault(element, 0) + 1);

        for (int element : arr2)
            arr2Frequencies.put(element, arr2Frequencies.getOrDefault(element, 0) + 1);

        for (int element : arr2) {
            int frequency = frequencies.get(element);

            for (int i = 0; i < frequency; i++) {
                arr3[arrSize++] = element;
            }
        }

        int[] keys = new int[frequencies.keySet().size()];
        int keysSize = 0;

        for (int key : frequencies.keySet())
            keys[keysSize++] = key;

        bubbleSort(keys);

        for (int key : keys) {

            if (arr2Frequencies.containsKey(key))
                continue;

            int frequency = frequencies.getOrDefault(key, 0);
            for (int i = 0; i < frequency; i++) {
                arr3[arrSize++] = key;
            }

        }

        System.out.println(Arrays.toString(arr3));

        return arr3;
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
