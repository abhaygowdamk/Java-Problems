import java.util.Arrays;

public class ReverseArray {

    public static void revArray(int arr[]) {
        int first = 0, end = arr.length - 1;
        while (first < end) {
            int temp = arr[first];
            arr[first] = arr[end];
            arr[end] = temp;
            first++;
            end--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {

        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        revArray(arr);

    }

}
