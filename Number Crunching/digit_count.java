import java.util.*;
public class digit_count{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int sum = 0;
        while (n >0){
           n= n/10;
            sum++;
        }
                System.out.println(sum);
    }
    }
