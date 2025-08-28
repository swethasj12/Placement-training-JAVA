import java.util.Scanner;

public class occurence_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n , key , count = 0,ld;
      n = sc.nextInt();
      key = sc.nextInt();
      while(n>0)  // n!=0
      {
          ld = n%10;
          n = n / 10;
          if(ld == key)
          {
            count++;
          }
    }
        System.out.println(count);
    }
}
    
