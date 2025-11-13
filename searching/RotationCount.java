package practice;

public class RotationCount {

    public static void main(String[] args) {

        int[] arr = {4,1, 1, 2, 2, 3, 3, 1};
        int rotationCount = findRotationCount(arr);
        System.out.println("ROtation Count: "+rotationCount);
    }

    static int findRotationCount(int[] arr) {

        // rotation count is nothing but new index of largest element; we find pivot and return it's index+1;

        int start = 0;
        int end = arr.length-1;

        if(arr[start] < arr[end]) {
            return 0;
        }

        if(arr.length==1) {
            return 0;
        }

        while(start<=end) {

            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1]) {
                return mid +1;
            } else if(arr[mid-1] > arr[mid]) {
                return mid;
            }

            if(arr[start] == arr[mid] && arr[mid] == arr[end]) {

                if(arr[start] > arr[start+1]) {
                    return start+1;
                }
                start ++;

                if(arr[end-1] > arr[end]) {
                    return end;
                }
                end --;
            }

            if(arr[mid] > arr[start] || (arr[start] == arr[mid] && arr[end] < arr[mid])) {
                start = mid+1;
            } else if(arr[mid] < arr[start]) {
                end=mid-1;
            }
        }

        return 0;
    }
}
