import java.util.Scanner;

/**
 * printDigitFromNumber
 */
public class printDigitFromNumber {
 
    public static void print_digits(int n)
    {
         /*Function to print the digits of the number n 
        Note Print all the digits in a new line*/
                int reverse = 0;       
        while (n > 0 ) {
            int digit = n % 10;
            reverse = reverse*10 +digit;
          
            n = n / 10;
            // System.out.println(digit); 
        }
        System.out.println(reverse);
          /* Do not change the code beyond this point*/
        
    
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        
        print_digits(n);
    }
    
}