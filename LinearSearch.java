public class LinearSearch {

    public static int search(int elements[], int key) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == key) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        /*
         * int key = 15;
         * int elements[] = { 1, 2, 5, 10, 8 };
         * boolean flag = false;
         * for (int i = 0; i < elements.length; i++) {
         * if (elements[i] == key) {
         * flag = true;
         * break;
         * } else {
         * flag = false;
         * }
         * }
         * if (flag) {
         * System.out.println(key + " Element found");
         * 
         * } else {
         * System.out.println(key + " Not found");
         * }
         */
        int key = 10;
        int elements[] = { 1, 2, 5, 10, 8 };
        System.out.println("The position of the element is " + search(elements, key));

    }

}
