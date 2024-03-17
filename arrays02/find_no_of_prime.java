import java.util.Scanner;

public class find_no_of_prime {

    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if (n % i ==0) {
               return false;
            }
        }
        return true;
    }

    public static int[] findNPrimes(int n){
            int[] arr = new int[n];
            arr[0] = 2;
            int indexCount = 1;
            int primeNumber = 3;
           while (indexCount < n) {
                if (isPrime(primeNumber)) {
                    arr[indexCount] = primeNumber;     
                   indexCount++;               
                }
                primeNumber++;
           }             
           return arr;
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of n :");
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
           int[] out=  findNPrimes(n);
           for (int i : out) {
            System.out.println(out[i]); 
           }
        }
    }
}
