package sectionBreaks;

public class SectionBreaks {

    public static void main(String[] args) {
    
        int[] arr = {27,28,94,67,8,1,3,5};
        sort(arr);
        int answer = arr[arr.length/2];
        System.out.println("SectionB starts from : "+answer);

    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            boolean hasSwapped = false;

            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {

                    int k = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = k;

                    hasSwapped = true;
                }
            }

            if (!hasSwapped)
                break;

        }

    }
}
