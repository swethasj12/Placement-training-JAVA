import java.util.Scanner;

public class odd_even_count
{
     public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        int count = 0;
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i = 0 ; i < size; i++){
            a[i] = sc.nextInt();
            if( a[i]%2 == 0)
            count ++;
        }
        System.out.println("Odd = " +(size - count));
                System.out.println("Even = " +(count));
     }
}
