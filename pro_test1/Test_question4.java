/**
 * Test_question4
 */
public class Test_question4 {

    public static void fullfill_need(int n) {
        int i =1;
        while (n>=0) {
            n = n - (i*i);
            i++;
        }
        System.out.println(i-2);
    }

    public static void main(String[] args) {
        int n =5 ;
        fullfill_need(n);
    }
}