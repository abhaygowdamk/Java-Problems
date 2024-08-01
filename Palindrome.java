import java.util.Scanner;

public class Palindrome {

    public static void palindrome(int num) {
        int temp = num;
        int rev = 0;

        while (num != 0) {
            int last = num % 10;
            rev = (rev * 10) + last;
            num /= 10;
        }
        if (temp == rev)
            System.out.println(rev);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(palindrome(n));

    }

}
