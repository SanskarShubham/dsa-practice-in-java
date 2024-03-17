import java.util.Scanner;

public class Sum_of_odd_length_array {
    public static int print_sum(int[] arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j+=2) {
                for (int j2 = i; j2 <= j; j2++) {
                    sum += arr[j2];
                }
            }     
        }
        return sum;
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

             int out = print_sum(arr);
             System.out.println("sum = "+out);
    }
}
}
