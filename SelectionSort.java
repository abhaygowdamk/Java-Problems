public class SelectionSort {

    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > (0 + i); j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 5, 4, 6 };
        SelectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
