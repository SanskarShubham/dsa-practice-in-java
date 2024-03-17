package looping01;
import java.util.Scanner;

public class ReverseNumber {
    public static int printReverse(int n){
         int reverse =0;
         while (n != 0) {
            int digit = n%10;
            reverse =  (reverse*10) + digit;
            n=n/10;
         }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println("Enter Number :");
        try (Scanner sc = new Scanner(System.in)) {
            int n =sc.nextInt();
            System.out.println(printReverse(n));
        }
    }
}
