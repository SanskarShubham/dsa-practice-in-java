package apna_coolege.recursion;

public class sum_of_naturalNumbers {
    
    public static void print_sum(int i, int n, int sum) {
        if (i > n) {
            System.out.println(sum);
            return;            
        }
        sum +=i;
        print_sum(i+1, n, sum);
    }
    public static void main(String[] args) {
        
        print_sum(1,10,0);
    }
}
