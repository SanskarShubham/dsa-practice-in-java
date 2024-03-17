package looping;
import java.util.Scanner;

public class Pattern_2 {
    public static void pattern(int n ){
        int i= n;
        while (i>0) {
            int j = 0;
            while (j<i) {
                System.out.print('*');
                j++;
            }
            System.out.println();
            i--;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number of lines :");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            pattern(n);
        }
    }
}
