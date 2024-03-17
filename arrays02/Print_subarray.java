
import java.util.Scanner;

public class Print_subarray {
    public static void subarray(int[] arr) {

      for (int i = 0; i < arr.length; i++) {
        for (int j = i; j < arr.length; j++) {
           for (int j2 = i; j2 <= j; j2++) {
            System.out.print(arr[j2]);
           } 
           System.out.println();
        }
      }
    }

    public static void main(String[] args) {
        System.out.println("Enter the no. of element in array:");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            subarray(arr);
            // System.out.println("These are following subarray :");
        }

    }
}
