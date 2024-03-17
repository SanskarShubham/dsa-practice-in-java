package looping01;
import java.util.Scanner;

/**
 * Pattern_1
 */
public class Pattern_1 {
    public static void print_pattern(int n){
        for (int i = n; i > 0; i--) {
            for(int j=0; j<i;j++){
                System.out.print('*');
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