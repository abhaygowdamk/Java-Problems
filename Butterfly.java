public class Butterfly {
    public static void main(String[] args) {
        int n = 3;
        int space = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            space -= 2;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
