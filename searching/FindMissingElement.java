package practice;

public class FindMissingElement {

    public static void main(String[] args) {

        int missing = findMissingElement(new int[]{0,1,2,4,5});
        System.out.println("Missing: "+missing);
    }

    public static int findMissingElement(int[] arr) {

        int start = 0;
        int end =   arr.length;
        int startIndex = 0;
        int endIndex = end-1;

        while(start<=end) {

            int mid = start + (end-start)/2;
            int indexOfMid = binarySearch(arr,mid,startIndex,endIndex);

            if(indexOfMid == -1) {
                return mid;
            }

            if(indexOfMid == mid) {
                start = mid+1;
                startIndex=indexOfMid;
            } else if(indexOfMid < mid) {
                end=mid-1;
                endIndex=indexOfMid;
            }
        }

        return end+1;
    }

    static int binarySearch(int[] arr, int target,int startIndex, int endIndex) {

        int start=startIndex;
        int end=endIndex;
        boolean isAsc = true;

        if(arr[start] > arr[end])
            isAsc=false;

        while(start<=end) {

            int mid = start + (end-start)/2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {

                if(arr[mid] > target) {
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            } else {

                if(arr[mid] > target) {
                    start=mid+1;
                } else {
                    end=mid-1;
                }
            }
        }

        return -1;
    }

}
