import java.util.Scanner;

public class time_valid {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String timeString = sc.next();
        String[] t = timeString.split(":");
        int hrs = Integer.parseInt(t[0]);
        int min = Integer.parseInt(t[1]);
        int sec = Integer.parseInt(t[2]);
        if(hrs <=24 && min <=60 && sec <= 60){
            System.out.println("Valid");
        }
            else{
                System.out.println("Not Valid");
            }
        }
    
}
