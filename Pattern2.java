public class Pattern2 {
    public static void main(String args[]){

        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(j==1||j==3){
                    System.out.print("* ");
                }
                else{
                    System.out.print(5+" ");
                }
            }
            System.out.println();
        }
    }
    
}