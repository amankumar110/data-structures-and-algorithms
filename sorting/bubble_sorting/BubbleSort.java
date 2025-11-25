import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = { 11, 22, 18, 14, 9, 3, 2, 7777 };
        System.out.println("");
        System.out.println("The unsorted list: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("The sorted list: " + Arrays.toString(arr));
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

    public void sortColors(int[] list) {

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

    }

}