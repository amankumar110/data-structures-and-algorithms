package insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    
    public static void main(String[] args) {
        int[] arr = {1,9,2,7,11,3,4};
        sort(arr);
        System.out.println("Sorted: "+Arrays.toString(arr));
    }

    public static void sort(int[] arr) {

        for(int i=0; i<=arr.length-2; i++) {

            for(int j=i+1; j>0; j--) {

                if(arr[j] < arr[j-1]) {
                    int k = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = k;
                } else {
                    break;
                }
            }
        }

    }
}
