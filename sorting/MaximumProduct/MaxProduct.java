package MaximumProduct;

public class MaxProduct {
    

   public int maxProduct(int[] nums) {
 
        bubbleSort(nums);
        return Math.max((nums[0]-1)*(nums[1]-1), (nums[nums.length-1]-1)*(nums[nums.length-2]-1));
    }

    public static int[] bubbleSort(int[] list) {

        for (int passCounter = 0; passCounter < list.length - 1; passCounter++) {

            boolean isSwaped = false;

            for (int j = 1; j < list.length - passCounter; j++) {

                if (list[j] < list[j - 1]) {
                    int k = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = k;

                    isSwaped = true;
                }
            }

            if (!isSwaped) {
                break;
            }

        }

        return list;
    }
}
