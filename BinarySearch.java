class BinarySearch {

    public static int binarySearch(int elements[], int key) {
        int start = 0;
        int end = elements.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (elements[mid] == key)
                return mid;
            if (elements[mid] < key) {
                start = mid + 1;
            }

            else
                end = mid - 1;

        }
        return -1;
    }

    public static void main(String[] args) {

        int elements[] = { 1, 2, 4, 5, 8, 20, 87 };

        int key = 4;

        int position = binarySearch(elements, key);
        System.out.println(position);

    }
}