import java.util.Scanner;

public class product_gn {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();  
        int product = 1;
        while (number > 0) {
            int ld = number % 10;    
            product = product * ld;            
            number = number / 10;                
        }
        System.out.println(product);     
    }
    
}
