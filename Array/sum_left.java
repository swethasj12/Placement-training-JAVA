import java.util.Scanner;

public class sum_left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum = 0;
        int a[]=  new int[size];
        for(int i = 0; i < size ; i++){
            System.out.print(sum + " ");
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        
    }
}
