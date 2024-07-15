import java.util.Scanner;

/*public class CheckPrime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag=0;
        if(n==0||n==1){
            System.out.println("Not a prime number");
        }

      for(int i=2;i<n;i++){
        if(n%i==0){
            System.out.println("Not a prime");
            flag =1;
            break;
        }
      }
      if(flag==0){
        System.out.println("Prime");
      }
    }
}
*/
public class CheckPrime {

  static void prime(int n) {
    int flag = 0;

    if (n == 0 || n == 1) {
      System.out.println("Not a prime number");
    } else {
      for (int i = 2; i < n; i++) {

        if (n % i == 0) {
          System.out.println("Not a prime");
          flag = 1;
          break;
        }
      }
      if (flag == 0) {
        System.out.println("Prime");
      }
    }

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    prime(n);
  }

}
