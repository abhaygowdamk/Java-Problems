import java.util.*;

public class Sunny_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n += 1;
        int sqrt = (int) Math.sqrt(n);
        if ((sqrt * sqrt) == n) {
            System.out.println("Sunny Number");
        } else {

            System.out.println("Not Sunny Number");
        }
    }

}
