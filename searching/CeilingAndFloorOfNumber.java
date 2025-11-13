package practice;

public class CeilingAndFloorOfNumber {

    public static void main(String[] args) {

        int[] arr = {12, 22};
        int target = 20;


        int ceiling = ceilingOfNum(arr,target);
        System.out.println("Floor: "+ceiling);
    }

    static int ceilingOfNum(int[] arr, int target) {
        // this function returns the smallest element >= target element

        int start = 0;
        int end = arr.length-1;

        // this means functions doesnot have a upper ceiling.
        if(arr[end] < target) {
            return -1;
        }

        while (start<=end) {

            int mid  = start + (end-start)/2;

            if(arr[mid]==target) {
                return arr[mid];
            } else if(arr[mid] > target) {
                end = mid-1;
            } else if(arr[mid] < target) {
                start=mid+1;
            }

        }

        return arr[start];
    }

    static int floorOf(int []arr, int target) {

        int start = 0;
        int end = arr.length-1;

        if(arr[start] > target) {
            return -1;
        }

        while(start>=end) {

            int mid = start + (end-start)/2;

            if(arr[mid] == target) {
                return arr[mid];
            } else if(arr[mid] > target) {
                end = mid-1;
            } else if(arr[mid] < target) {
                start = mid+1;
            }
        }

        return arr[end];
    }


}
