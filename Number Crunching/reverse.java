import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long rev = 0;
            while( n > 0){
                long ld = n % 10;
                n = n /10;
                rev = rev * 10 + ld;
            }
    System.out.println(rev);
    }
}
