package looping;
import java.util.Scanner;

public class SeriesExpect5 {
    public static void print_series(int n){
        int i =1;
        while(i <= n){
            if ((i % 5) != 0) {
                System.out.println(i);
               
            }
            i++;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n :");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            print_series(n);
        }

    }
}
