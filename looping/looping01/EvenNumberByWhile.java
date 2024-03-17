package looping01;
import java.util.Scanner;

public class EvenNumberByWhile {

    public static void printEvenNo(int n){
        int i =2;
        while (i <= n) {
            System.out.println(i);
              i= i+2;              
        }
    }
        public static void main(String args[]){
    
        System.out.print("Enter the value of n:");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            printEvenNo(n);
        }
    }
}
