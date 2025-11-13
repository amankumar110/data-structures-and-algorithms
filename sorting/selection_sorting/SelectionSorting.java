package selection_sorting;

import java.util.Arrays;

public class SelectionSorting {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        selectionSort(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {

        for(int i=0 ; i<arr.length; i++) {

            int largestElementIndex = findLargest(arr,0,arr.length-1-i);

            int k = arr[largestElementIndex];
            arr[largestElementIndex] = arr[arr.length-1-i];
            arr[arr.length-1-i] = k;

        }

    }

    public static int findLargest(int[]arr, int start, int end) {

        int largest = arr[start];
        int largestIndex = start;

        for(int i=start;i<=end;i++) {

            if(arr[i] > largest) {
                largest = arr[i];
                largestIndex = i;
            }
        }

        return largestIndex;
    }

}
