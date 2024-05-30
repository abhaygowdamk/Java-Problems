import java.lang.Math;
import java.util.Random;
public class RandomNumbers {
    public static void main(String args[]){
        /* 
        //using random method
        //lets print 10 random numbers
        for(int i=0;i<10;i++){
            System.out.print(Math.random()+" ");
        }
        */
        //usi8ng Random class
        Random random = new Random();
        for(int i=0;i<50;i++){
        int x = random.nextInt(50);
        System.out.print(x+" ");
        }

        double d = random.nextDouble();
        System.out.println(d);

    }
    
}
