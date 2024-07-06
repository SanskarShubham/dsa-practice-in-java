package apna_coolege.recursion;

public class print_1_to_5 {

    public static void print_number(int n, int i) {
        
        System.out.println(i);
        if (n == i) {
            return;
        }
        
        print_number(n,i+1);
    }

    public static void main(String[] args) {
        int n = 5;

        print_number(n,1);
    }
}
