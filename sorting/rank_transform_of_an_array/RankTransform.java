package rank_transform_of_an_array;

import java.util.Arrays;

public class RankTransform {

    public static void main(String[] args) {

        int[] transformed = arrayRankTransform(new int[] { 40, 10, 20, 30 });
        System.out.println(Arrays.toString(transformed));
    }

    public static int[] arrayRankTransform(int[] arr) {

        int[] sortedCopy = bubbleSort(arr.clone());


        for (int i = 0; i < arr.length; i++) {

            int rank = findRank(arr[i], sortedCopy);
            arr[i] = rank;
        }

        return arr;
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

    public static int findRank(int target, int[] arr) {

        int freshIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i != 0) {
                int previousIndex = i - 1;
                if (arr[previousIndex] == arr[i]) {
                    freshIndex--;
                }
            }

            if (arr[i] == target) {
                return freshIndex + 1;
            }

            freshIndex++;
        }

        return freshIndex + 1;
    }

    public static int firstOccurrence(int target, int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    int ans = -1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            ans = mid;       // found, but continue left
            right = mid - 1;
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return ans;
}

}
