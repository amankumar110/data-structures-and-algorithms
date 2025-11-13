package absent_student;

public class AbsentStudent {

    /*
     * 🧩 Problem: “Find the Missing Student’s Roll Number”
     * 
     * You are given an unsorted array of unique roll numbers of students who
     * attended a class.
     * The roll numbers range from 1 to N, but one student was absent, so one roll
     * number is missing.
     * 
     * Your task is to:
     * 
     * Sort the roll numbers using Bubble Sort.
     * 
     * Use Binary Search to find the missing roll number efficiently.
     * 
     * 📥 Input
     * 1. An integer N representing the total number of students.
     * 2. An array arr[] of length N-1, containing distinct integers in the range
     * [1, N].
     */

    public static void main(String[] args) {
        int[] arr = new int[] { 5, 1, 3, 2 };
        sort(arr);
        int result = searchAbsentRollNumber(arr);
        System.out.println("Missing Student: " + result);
    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            boolean hasSwapped = false;

            for (int k = 1; k < arr.length - i; k++) {
                if (arr[k] < arr[k - 1]) {
                    int t = arr[k];
                    arr[k] = arr[k - 1];
                    arr[k - 1] = t;
                    hasSwapped = true;
                }
            }

            if (!hasSwapped)
                break;
        }
    }

    public static int searchAbsentRollNumber(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == mid + 1) {
                start = mid + 1;
            } else {
                result = arr[mid] - 1;
                end = mid - 1;
            }
        }

        return result;

        // 1,2,3,4,5,6,7,8
    }
}
