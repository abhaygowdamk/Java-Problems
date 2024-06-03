import java.util.Scanner;
public class Automorphic_Number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int square = n*n;
        boolean flag = true;
        while(n>0){
            int last_digit_square = square%10;
            int last_digit_n = n%10;

            if(last_digit_square!=last_digit_n){
                flag = false;
                break;
            }
            square/=10;
            n/=10;
        }
        if(flag){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println(" not Automorphic_Number");
        }

    }
    
}
