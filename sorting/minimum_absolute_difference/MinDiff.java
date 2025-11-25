package minimum_absolute_difference;

import java.util.ArrayList;
import java.util.List;

public class MinDiff {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        bubbleSort(arr);

        List<List<Integer>> diffs = new ArrayList<>();
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - 2; i++) {

            int diff = arr[i + 1] - arr[i];

            if (diff > minDifference) {
                continue;
            } else if (diff < minDifference) {
                minDifference = diff;
                diffs = new ArrayList<>();
            }

            List<Integer> pair = new ArrayList<>();
            pair.add(arr[i]);
            pair.add(arr[i + 1]);
            diffs.add(pair);
        }

        return diffs;

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
