
//========== User's Code Starts Here ==========
import java.util.*;
import java.lang.Math;

public class seriesUsingwhile {

    public static void print_series(int n) {
        /*
         * Print the following series
         * 1 4 9 16 25 36 to n. Note print all the numbers in a seperate line
         */
        // double i = Math.sqrt(n);
        int i = 1;
        while (i * i <= n) {

            System.out.println(i * i);
            i++;
        }
        /* Do not change the code beyond this point */

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        print_series(n);
    }
}