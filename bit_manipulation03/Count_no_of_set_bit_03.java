import java.util.Scanner;

public class Count_no_of_set_bit_03 {

    public static int count_bit(int n){
   
        int count = 0;
        
        while (n >0) {
           int bit  = n & 1;
           if (bit ==1) {
            count++;
           }
            n >>= 1;
        }
      
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        try (Scanner sc = new Scanner(System.in)) {
            int n  = sc.nextInt();
            System.out.println(Integer.toBinaryString(n));
            int res= count_bit(n);
            System.out.println("Set Bit = "+res);
        }
    }
}
