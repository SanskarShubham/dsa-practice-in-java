package looping;
import java.util.Scanner;

public class CheckArmstrong {
    public static boolean checkArm(int n) {
        int number = n;
        double sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum = sum + Math.pow(digit, 3);
            n = n / 10;
        }

        if (number == (int) sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter Number :");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(checkArm(n));
        }
    }
}
