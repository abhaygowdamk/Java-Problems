import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0;
        int temp=n;
        while(n>0){
            int last_digit = n%10;
            rev=rev*10+last_digit;
            n=n/10;
        }

        if(rev==temp){
            System.out.println(rev);
        }
        else{
            System.out.println("Not a palindrome");
        }
        
    }
    
}
