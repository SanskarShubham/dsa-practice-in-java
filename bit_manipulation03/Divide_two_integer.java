import java.util.Scanner;

/**
 * Divide_two_integer
 */
public class Divide_two_integer {
    public static int divide(int dividend, int divisor) {

        int res = 0;
        int number = 0;
        int sign = 1;
        if (dividend == 2147483647 && divisor == -2147483648)
            return 0;
        if (dividend == -2147483648 && divisor == -1)
            return Integer.MAX_VALUE;
        if (dividend == 2147483647 && divisor == 1)
            return Integer.MAX_VALUE;
        if (dividend == 0)
            return 0;
        if (divisor == 0)
            return Integer.MAX_VALUE;

        if (dividend < 0 && divisor > 0) {
            sign = -1;
        } else if (dividend > 0 && divisor < 0) {
            sign = -1;
        }
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        while (n >= number) {
            number += d;
            res++;
        }
        return (res-1) * sign;

        // int result = 0;
        // int sign = 1;
        // if (dividend == 2147483647 && divisor == -2147483648)
        // return 0;
        // if (dividend == -2147483648 && divisor == -1)
        // return Integer.MAX_VALUE;
        // if (dividend == 0)
        // return 0;
        // if (divisor == 0)
        // return Integer.MAX_VALUE;

        // if (dividend < 0 && divisor > 0) {
        // sign = -1;
        // } else if (dividend > 0 && divisor < 0) {
        // sign = -1;
        // }
        // long n = Math.abs((long) dividend);
        // long d = Math.abs((long) divisor);

        // while (n >= d) {
        // int y = 0;
        // while (n >= (d << y) && (d << y) > 0) {
        // y++;
        // }
        // n = n - (d << (y - 1));
        // result += 1 << (y - 1);

        // }
        // return result * sign;

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int devident = sc.nextInt();
            int divisor = sc.nextInt();
            int res = divide(devident, divisor);
            System.out.println(res);
        }
    }
}