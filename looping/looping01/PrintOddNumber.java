package looping01;
import java.util.Scanner;

public class PrintOddNumber {
    public static void oddNumber(int n){
    //    for (int i = 1; i <= n ; i +=2) {
    //     System.out.println(i);
    //    }

    for (int i = 1; i < n; i++) {
        System.out.println((int)Math.pow(i, 3));
    }
    }

    public static void main(String[] args) {
        System.out.println("Enter The Number");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            oddNumber(n);
        }
    }
}
