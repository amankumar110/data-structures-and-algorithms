package practice;

public class BinarySearchInfiniteArray {

    public static void main(String[] args) {


        // this is just an augmentation question creating an infinite array isn't realistic in java.

        int[] arr = {1,2,3,55,67,81,88,93,95,97,100,101,103,106,111,123,134,143,151,156};
        int target = 111;
        int index = searchIndex(arr,target);
        System.out.println("Index: "+index);
    }

    static int searchIndex(int[] arr, int target) {

        int start=0;
        int end=1;

        while(arr[end] < target) {

            if(arr[end] < target) {
                int currentWindowSize = (end-start+1);
                start=end+1;
                // inclusion counting formulla;
                //end=2*end; compounding 1,2,4,8,16,...
                end = end + currentWindowSize*2; // more progresssive 1, 5,13,.... cant solve with less window sliding with more bigger jumps
            } else {
                return end;
            }
        }

        while(start<=end) {

            int mid = start + (end-start)/2;

            if(arr[mid] < target) {
                start=mid+1;
            } else if(arr[mid] > target) {
                end=mid-1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
