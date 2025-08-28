import java.util.Scanner;

public class left_right {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        int a[] = new int[size];
        for(int i = 0; i < size; i++){
            a[i]= sc.nextInt();
            System.out.print(a[i] + " ");
        }

     }
}
