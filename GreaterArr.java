public class GreaterArr {
    // greater
    public static int greater(int elements[], int greater) {

        for (int i = 0; i < elements.length; i++) {

            if (elements[i] > greater)
                greater = elements[i];

        }
        return greater;
    }

    // smaller
    public static int smaller(int elements[], int smaller) {
        for (int i = 0; i < elements.length; i++) {

            if (elements[i] < smaller)
                smaller = elements[i];

        }
        return smaller;
    }

    public static void main(String[] args) {
        int great = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        int elements[] = { 5, 8, 10, 6, 12 };

        int greater_num = greater(elements, great);
        int smaller_num = smaller(elements, small);

        System.out.println("The greater element is " + greater_num);
        System.out.println("The greater element is " + smaller_num);

    }

}
