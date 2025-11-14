public class FirstMissing {

    public static void main(String[] args) {
        
        int missing = findFirstMissingPositive(new int[]{1,2,3,5});
        System.out.println("Missing: "+missing);
    }

    public static int findFirstMissingPositive(int[] nums) {

        for(int i=0; i<nums.length;i++) {

            if(nums[i] <= 0 || nums[i] > nums.length) {
                continue;
            }

            int correctPosition = nums[i]-1;

            if(nums[i] == nums[correctPosition]) {
                continue;
            } else {
                int k = nums[correctPosition];
                nums[correctPosition] = nums[i];
                nums[i] = k;
                i--;
            }

        }

        for(int i=1; i<=nums.length;i++) {

            if(i != nums[i-1]) {
                return i;
            }
        }

        return nums.length+1;
    }

}