
import java.util.Scanner;

public class Runnig_sum_of_array {
    public static int[] runnig_sum(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                arr[i] = arr[i-1] +arr[i];
            }
        return arr;

    }

    public static void main(String[] args) {
        System.out.println("Enter The No of Element in Array :");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println("Enter The Element of Array :");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] out = runnig_sum(arr);
            System.out.println("running sum :");
            for (int i : out) {
                System.out.println(i);
            }
        }
    }
}
