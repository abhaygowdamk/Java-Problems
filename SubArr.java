public class SubArr {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            System.out.println(arr[start]);
            for (int j = i + 1; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }

                System.out.println();

            }
            System.out.println();
        }
    }

}
