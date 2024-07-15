import java.util.Scanner;

class LargestArray {

    public static int largestValue(int arrr[], int largest) {
        for (int i = 0; i < arrr.length; i++) {
            if (arrr[i] > largest) {
                largest = arrr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int arr[] = { 12, -1, 2, 45, 0, 987, 587, 100 };

        System.out.println("The largest value is " + largestValue(arr, largest));

    }
}