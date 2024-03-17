
import java.util.Scanner;

public class First_n_prime_number {
    public static int[] prime_number(int n){
      
        int nCounter = 0;
        int i=2;    
        int[] arr = new int[n];
        while(nCounter <n){
            int isPrime = 0;
            for (int j = 2; j < i; j++) {
             
            if (i % j ==0) {
                isPrime++;
            }    
            }           
            if (isPrime <1) {
                arr[nCounter]=i;
                nCounter++;
            }
            i++;
        }
    
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n :");
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();

            int arr[] =  prime_number(n);
            for (int i : arr) {
                
                System.out.println(i);
            }
        }
    }
}
