import java.util.Scanner;

public class Alternative_bits_04 {

    public static boolean count_bit(int n){

        int cur = n & 1;
        int pre = (n>>1) &1;

        while (n >0) {
            if (cur == pre) {
                return false;
            } 
            n >>=1;
         cur = n & 1;
         pre = (n>>1) &1;   
        }
        return true;















    //         int current = n & 1;
    //         n >>= 1;
    //         int pre = n & 1;

    //         while (n != 0) {
    //             if (current == pre) {
    //                 return false;
    //             }
    //              current = pre;
    //              n >>=1;
    //             pre = n&1;
    //         }
    //    return true;
    }
    public static void main(String[] args) {
          System.out.println("Enter the Number:");
        try (Scanner sc = new Scanner(System.in)) {
            int n  = sc.nextInt();
            System.out.println(Integer.toBinaryString(n));

            boolean res= count_bit(n);
            System.out.println(res);
        }
    }
}
