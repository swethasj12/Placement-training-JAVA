import java.util.Scanner;

public class divisible_3or5 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%3 ==0 && n%5==0){
            System.out.println("HiHello");
        }
        else if(n%3 == 0){
            System.out.println("Hi");
            
        }
        else {
            System.out.println("Hello");
        }
        }
    
}
