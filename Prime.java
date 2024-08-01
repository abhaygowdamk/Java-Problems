public class Prime {

    public static int prime(int num) {
        if (num == 0 || num == 1)
            return -1;
        for (int i = 2; i < (Math.sqrt(num)); i++) {
            if (num % i == 0)
                return -1;
        }
        return num;
    }

    public static void main(String[] args) {
        int primeNum = 3;

        System.out.println(prime(primeNum));
    }

}
