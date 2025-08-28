import java.util.Scanner;
public class strong_num {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1, sum = 0,ld = 0;
        int n = sc.nextInt();
        int copy = n ;
        while(n > 0){
           ld = n % 10;
                  fact = 1;
            for (int i = 1 ; i <= ld; i++){
            fact = fact * i;
                
        }
        sum = sum + fact;
            n = n / 10;
        }
            if(copy == sum ){
                System.out.println( "Strong Number");
                
            }else{
                System.out.println("Not a strong number");
            }
        
        }
}
