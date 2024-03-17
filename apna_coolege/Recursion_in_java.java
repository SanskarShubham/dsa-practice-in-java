import java.util.Scanner;

public class Recursion_in_java {

    public static void print_number(int i,int n ,int sum){
        if (i > n) {
            System.out.println(sum);
            return;
        }
        sum += i;
        print_number(i+1,n,sum);
    }
    public static void cal_factorial(int n,int res)
    {
        if(n ==0){
            System.out.println(res);
            return;
        }
        res *=n;
        cal_factorial(n-1, res);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // int i = sc.nextInt();
            int n = sc.nextInt();
            int res =1;
            // int sum = 0;
            // print_number(i,n,sum);
            cal_factorial(n,res );
        }
    }
}
