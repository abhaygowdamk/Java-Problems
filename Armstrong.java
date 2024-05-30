import java.lang.Math; 
public class Armstrong {
    public static void main(String args[]){
        int n=8207;
        int sum=0;
        int temp = n;
        int digit=0;
        while(temp>0){
            temp=temp/10;
            digit++;
        }
        temp=n;
        while(temp>0){
            int last=temp%10;
            sum+=Math.pow(last,digit);
            temp/=10;
        }
        if(n==sum){
            System.out.println("Armstrong");

        }
        else{
            System.out.println("Not Armstrong");
        }
        
    }
    
}
