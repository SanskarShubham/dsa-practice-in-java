
import java.util.Scanner;

public class Maximum_in_array {
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max =arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n :");
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter The Element Of Array :");
             for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
             }   
            int output =  findMax(arr);
            System.out.println("Maximum = "+output);
        }
    }
}
