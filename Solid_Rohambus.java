public class Solid_Rohambus {
    public static void main(String[] args) {
        int n = 5;
        int space = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space--;
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }

}
