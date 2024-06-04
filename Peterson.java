import java.util.Scanner;

public class Peterson {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int last = temp % 10;
            int fact = 1;
            for (int i = last; i > 0; i--) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if (sum == n) {
            System.out.println("Peterson number");
        } else {
            System.out.println("Not Peterson number");
        }
    }

}
