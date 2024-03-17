package looping01;

import java.util.Scanner;

public class Printdigit {
      public static void printDigitOfNumber(int n){
        while(n !=0){
            int digit = n %10;
            n = n/10;
            System.out.println(digit);
        }
      }
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();    
            printDigitOfNumber(n);
        }
    }
}
