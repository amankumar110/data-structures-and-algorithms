public class SetMismatch {

    public static void main(String[] args) {
        
        int[] arr = {1,1};
        int[] result = findErrorNums(arr);
        System.out.println("Duplicated: "+result[0]+" Missing: "+result[1]); 
    }


    public static int[] findErrorNums(int[] nums) {

        for(int i=0; i<nums.length;i++) {

            int correctSpot = nums[i]-1;

            if(nums[correctSpot] == nums[i]) {
                continue;
            } else {
                int k = nums[correctSpot];
                nums[correctSpot] = nums[i];
                nums[i] = k;
                i--;
            }
        }

        for(int finder=1; finder<=nums.length;finder++) {
            if(nums[finder-1] != finder) {
                return new int[]{nums[finder-1],finder};
            }
        }

        return new int[]{};
    }
}