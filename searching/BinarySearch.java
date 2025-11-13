package practice;

public class BinarySearch {

    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};

        System.out.println(binarySearch.search(arr,11));
    }

    public int search(int[] nums, int target) {

        int startIndex = 0;
        int endIndex = nums.length-1;

        while(startIndex<=endIndex) {

            int middleIndex = Math.floorDiv((startIndex+endIndex),2);

            if(nums[middleIndex] == target) {
                return middleIndex;
            } else if(target>nums[middleIndex]) {
                startIndex = middleIndex+1;
            } else if(target<nums[middleIndex]) {
                endIndex = middleIndex-1;
            }
        }

        return -1;
    };
}
