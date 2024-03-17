import java.util.*;
public class printOneToN {
    //========== User's Code Starts Here ==========


    public static void print_output(int n)
    {
          /*Print all numbers from 1 to n except the ones divisible by 5
    use the help of continue statement to leverage this  */
     /* Do not change the code beyond this point*/
     int i = 1;
        while (i <= n) {
            if (i % 5 !=0) {
                System.out.println(i);
            }
            
            ++i;
        }
    
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        
        print_output(n);
    }
}
//========== User's Code Ends Here ==========


