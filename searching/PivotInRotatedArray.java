package practice;

public class PivotInRotatedArray {

    public static void main(String[] args) {
        /*
        lets say the given array is like this:
        arr = {1,5,9,13,13,15,15,18,19,19,22};
        after rotation of k times it becomes:
        arr = {19,22,1,5,9,13,13,15,15,18,19};

        now we need to find the pivot or new index of the largest element

        start=0;
        mid=5;
        end=10;

        if(arr[start] < arr[end] || (arr[start] == arr[mid] && arr[start] > arr[end] // just check if it
        was sorted before rotation)):
            array is sorted left side, look in right side : start=mid+1;
        else:
            look in left side : end=mid-1;
         */

         int[] arr = {19,22,1,5,9,13,13,15,15,18,19};
         int pivot = findPivot(arr);
        System.out.println("Pivot: "+pivot);

    }

    static int findPivot(int[] nums) {


        int start=0;
        int end= nums.length-1;

        while(start<=end) {

            int mid = start + (end-start)/2;

            if(nums[mid] > nums[mid+1]) {
                return mid;
            } else if(nums[mid-1] > nums[mid]){
                return mid-1;
            }

            if(nums[start] == nums[mid] && nums[mid] ==  nums[end]) {

                if(nums[start] > nums[start+1])
                    return start;

                start++;

                if(nums[end-1] > nums[end])
                    return end;

                end--;
            }

            if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[end] < nums[mid])) {
                start=mid+1;
            } else if(nums[start] > nums[mid]) {
                end=mid-1;
            }

        }

        return -1;
    }
}
