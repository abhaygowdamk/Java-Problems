class Diamond {
    public static void main(String[] args) {
        int n = 4;
        int space = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space--;

            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        space = n - 3;
        for (int i = 4; i >= 1; i--) {

            for (int j = 2; j <= space; j++) {
                System.out.print(" ");
            }
            space++;
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
