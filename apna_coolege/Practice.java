import java.util.Scanner;

public class Practice {
    // Q1 . Enter 3 numbers from the user & make a function to print their average.

    public static int print_avg(int no1, int no2, int no3) {

        return (no1 + no2 + no3) / 3;
    }
    // Q. Write a function to print the sum of all odd numbers from 1 to n.

    public static void print_odd(int n) {
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i+" ");
        }
    }
    // Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

     public static void count_type(int[] arr) {
        int positive =0;
        int negative =0;
        int zero =0;
            for (int i = 0; i < arr.length; i++) {
              if (arr[i] >0) {
                positive++;
              }  
              
              if (arr[i] < 0) {
                negative++;
              }  
              if (arr[i] == 0) {
                zero++;
              }
            }
            System.out.println("Positive= "+positive+" Negative= "+negative +" Zero= "+zero);
    }
    // Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

    public static int findPowerOfN(int x, int n){
        int power = 1;
        for (int i = 0; i < n; i++) {
            power *= x;
        }
        return power;
    }

    // Write a program to print Fibonacci series of n terms where n is input by user :
    // 0 1 1 2 3 5 8 13 21
    public static void fibonacci_series(int n){
        int a = 0 , b=1;
        System.out.print(a+" "+b+" ");

        for (int i = 0; i < n-2; i++) {
            int c= a+b;
             a=b;
             b=c;
             System.out.print(c+" ");
        }
    }

    public static int GreatestCommonDivisor(int a,int b){
         
        while (a>0) {
        int rem =  a % b ;
        if(rem ==0){
            return b;
        }
        a =b;
        b = rem;    
        }    
        return 0;
    }


    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // System.out.println("Enter 3 numbers :");
            // int a = sc.nextInt();
            // int b = sc.nextInt();
            // int c = sc.nextInt();
            // int avg = print_avg(a, b, c);
            // System.out.println("Avg =" + avg);

            // System.out.println("Enter the number of element in array :");
            // int n = sc.nextInt();
            // int[] arr = new int[n];
            // for (int i = 0; i < n; i++) {
            //     arr[i] = sc.nextInt();
            // }
            // count_type(arr);
            

            // print_odd(n);
            // System.out.println("Enter x and n :");
            // int x = sc.nextInt();
            // int n = sc.nextInt();
            // int ans =  findPowerOfN(x, n);
            // System.out.println("Ans = "+ans );
            
            // System.out.println("Enter n :");
            // int n= sc.nextInt();
            // fibonacci_series(n);

            System.out.println("Enter 2 number :");
            int a = sc.nextInt();
            int b = sc.nextInt();
           int out =  GreatestCommonDivisor(a,b);
           System.out.println(out);
        }
    }
}
