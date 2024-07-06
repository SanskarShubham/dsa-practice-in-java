package apna_coolege.recursion;

public class factorialOfNumbers {

    public static int printFactorial(int n) {
        if(n ==  0){
            return 1;
        }

        int fact = printFactorial(n-1);
        int res = n * fact;
        return res;

    }
    
    public static void main(String[] args) {
        
      int res =  printFactorial(5);
      System.out.println(res);
    }
}
