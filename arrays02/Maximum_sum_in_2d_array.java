
import java.util.Scanner;

public class Maximum_sum_in_2d_array {
  public static int findMax(int[] arr) {
    int maxSum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j=j+2) {
          for (int j2 = i; j2 <= j; j2++) {
            maxSum += arr[j2];
          }
      }
   
    }
    return maxSum;

    // int max = arr[0][0];

    // for (int i = 0; i < arr.length; i++) {
    // int tempSum = 0;
    // for (int j = 0; j < arr[i].length; j++) {
    // tempSum += arr[i][j];
    // }
    // if (tempSum > max) {
    // max =tempSum;

    // }
    // }
    // return max;
  }

  public static void main(String[] args) {
    System.out.println("Enter the no of row and column :");
    try (Scanner sc = new Scanner(System.in);) {
      int r = sc.nextInt();
      // int c = sc.nextInt();

      int arr[] = new int[r];

      System.out.println("Enter the element of array :");
      for (int i = 0; i < r; i++) {
          arr[i] = sc.nextInt();
        }
     
      int out = findMax(arr);
      System.out.println("Max =" + out);

    }
  }
}
