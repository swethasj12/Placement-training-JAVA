import java.util.Scanner;
public class right_left {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n >=1){
            int ld = n % 10;
            System.out.print(ld+" ");
            n = n / 10;
    
        }
}
}
