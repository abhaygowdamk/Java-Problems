class BinarySearch {

    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == key)
                return mid;

            else if (arr[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;

        }
        return -1;

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, 5, 8, 20, 87 };

        int key = 8;

        int position = binarySearch(arr, key);

        System.out.println(position);

    }
}