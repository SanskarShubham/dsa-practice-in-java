package looping01;
// import java.util.*;
public class Pattern
{
   
    public static void print_pattern()
    {
         /* Function to print the pattern */
         int i,j;
         
         for(i=5; i>0; i--){
             for(j=0;j<i;j++){
                 System.out.print('*');
             }
             System.out.println();  
         }

        /* Do not change the code beyond this point*/
    }
     public static void main(String[]args)
    {
        // Scanner sc=new Scanner(System.in);
        // int n = sc.nextInt();
        print_pattern();
    }
}