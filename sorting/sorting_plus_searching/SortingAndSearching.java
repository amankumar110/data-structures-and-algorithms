package sorting_plus_searching;

import java.util.Arrays;

public class SortingAndSearching {

    public static void main(String[] args) {

        int[] arr = {-1,8,-2,0,4};

        if(arr.length<=100)
            selectSort(arr);
        else
            bubbleSort(arr);     

        System.out.println("Sorted Array: "+Arrays.toString(arr));

    };

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            boolean hasSwapped = false;

            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    hasSwapped = true;

                }

            }

            if (!hasSwapped) {
                break;
            }
        }
    };

    public static void selectSort(int[] arr) {

        for(int i=0;i<arr.length;i++) {

            int universalLargestIndex = arr.length-1-i;
            int largestElementIndex = getLargestElementIndex(arr,universalLargestIndex);
            
            int temp = arr[universalLargestIndex];
            arr[universalLargestIndex] = arr[largestElementIndex];
            arr[largestElementIndex] = temp;
        }
    };

    public static int getLargestElementIndex(int[] arr, int end) {

        int largest = arr[0];
        int largestIndex = 0;

        for(int i=1;i<=end;i++) {
            if(arr[i] > largest) {
                largest = arr[i];
                largestIndex = i;
            }
        }

        return largestIndex;
    }

}
