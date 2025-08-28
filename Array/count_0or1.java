import java.util.Scanner;

public class count_0or1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int zc = 0, oc= 0;
        int a[] = new int[size];
        for(int i = 0 ;i < size;i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i< size; i++){
            if(a[i] == 0){
            zc++;
        }else if (a[i] == 1){
            oc++;
        }
    }
                    System.out.println("zc = " +zc);
          System.out.println("oc = " + oc);
}
    
}
