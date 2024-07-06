package apna_coolege.recursion;

public class fibonaci_series {

    public static void print_series(int a, int b, int n){
        if (n==0) {
            return;
        }
        int c = a+b;
        System.out.println(c);
        print_series(b, c, n-1);
    }
    
    public static void main(String[] args) {
        int a=1,b=2,n=10;
        System.out.println(a);    
        System.out.println(b);

        print_series(a,b,n-2);
    }
}
