package looping;
import java.util.Scanner;

public class PrintOddNumber {
    public static void oddNumber(int n){
        for(int i=1;i<=n; i=i+2){
            System.out.println(i);
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
