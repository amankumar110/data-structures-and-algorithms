package height_checker;

public class HeightChecker {

    public static void main(String[] args) {

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

    public int heightChecker(int[] heights) {

        int[] heightCopy = heights.clone();
        bubbleSort(heightCopy);
        int incorrectHeights=0;

        for(int i=0; i< heights.length; i++) {

            if(heightCopy[i] != heights[i])
                incorrectHeights++;
        }

        return incorrectHeights;
    }
}
