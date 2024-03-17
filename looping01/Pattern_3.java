package looping;
import java.util.Scanner;

public class Pattern_3 {
      public static void  print_pattern(int n){
        for(int k=n;k>0;k--){
            for(int l=0;l<k;l++){
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
      }
    public static void main(String[] args) {
         System.out.println("Enter the No. of Line : ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            print_pattern(n);
        }
    }
}
