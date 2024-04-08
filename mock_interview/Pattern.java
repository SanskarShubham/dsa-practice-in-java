package mock_interview;

import java.util.Scanner;

public class Pattern {
    public static void print_pattern(int n) {

        for (int i = 0; i <= n; i++) {
            for (int j = n-i; j > 0 ; j--) {
                System.out.print('*');
            }  
            for (int j = 0; j < i*2; j++) {
                System.out.print(" ");
            }  
            for (int j = n-i; j > 0 ; j--) {
                System.out.print('*');
            }          
            System.out.println();
        }

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 1; j < n-i; j++) {
        //         System.out.print(" ");
        //     }
        //      for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }

    public static void main(String[] args) {
        System.out.println("Enter the no. of lines:");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            print_pattern(n);
        }
    }
}
