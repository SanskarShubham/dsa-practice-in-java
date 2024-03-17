
import java.util.Scanner;

public class Storing_element_in_arr {
    public static int[] store_array(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of number of element in array :");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int output[] = store_array(n);
            for (int i : output) {
                System.out.println(i);
            }
        }
    }
}
