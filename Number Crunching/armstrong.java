import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum=0,power  =1 ,count=0,ld;
        n = sc.nextInt();  // 14       5 
        int copy = n;
        while(n>0)
        {
            count++;
            n = n/10;
        }
        n = copy;
        while(n>0)
        {
            ld = n% 10;   // 15      3
            n = n /10;
            power = 1;
            for(int i=1 ; i<=count ; i++)
            {
                power = power * ld;
                
            }
            sum = sum + power;
        }
        if(copy == sum)
        System.out.println("Armstrong number");
        else 
        System.out.println("Not an Armstrong number");
    }
        
}
    
