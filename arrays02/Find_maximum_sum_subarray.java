

import java.util.Scanner;

public class Find_maximum_sum_subarray {
    public static int find_maximum_sum(int[] arr, int n) {
       int maxSum = Integer.MIN_VALUE;

       for (int i = 0; i < arr.length; i++) {
        int currentSum = 0;
        for (int j = i; j < arr.length; j++) {
            currentSum += arr[j];
            if (currentSum > maxSum) {
                maxSum = currentSum;                
            }
            
            // for (int j2 = 0; j2 < arr.length; j2++) {
            // }
        }
       }


       return maxSum;
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
            int out = find_maximum_sum(arr, n);
            System.out.println(out);
        }
    }
}
