import java.util.Arrays;

public class ReverseArray {

    public static void revArr(int arr[]) {
        int[] res = new int[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            res[k++] = arr[i];
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");

        }

    }

    /*
     * public static void revArr(int arr[]) {
     * int first = 0, last = arr.length - 1;
     * while (first < last) {
     * int temp = arr[last];
     * arr[last] = arr[first];
     * arr[first] = temp;
     * first++;
     * last--;
     * }
     * }
     */

    public static void main(String[] args) {

        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        revArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
