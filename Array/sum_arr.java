import java.util.Scanner;

public class sum_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i = 0; i< size; i++){
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.print(sum);
    }
    
}
