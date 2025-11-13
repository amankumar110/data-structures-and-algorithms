package missing_element;

public class MissingElement {

    public static void main(String[] args) {
        
        int[] nums = {3,0,1};
        int missing = findMissing(nums);
        System.out.println("Missing: "+missing);
    }

    public static int findMissing(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] >= nums.length || nums[i] == i) {
                continue;
            } else {
                int correctIndex = nums[i];
                int currentIndex = i;
                nums[currentIndex] = nums[correctIndex];
                nums[correctIndex] = correctIndex;
                i--;
            }
        }

        for (int finder = 0; finder < nums.length; finder++) {
            if (finder != nums[finder]) {
                return finder;
            }
        }

        return nums.length;

    }
}
