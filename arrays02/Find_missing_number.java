import java.util.Scanner;

public class Find_missing_number {
        public static int findMissing(int[] arr){
            
            int n = arr.length +1;
            int sum = n*((n+1)/2);
            int secondSum = 0;
            for (int i : arr) {
                secondSum += i;
            }

            
            return sum - secondSum;

         
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
            int output =  findMissing(arr);
             System.out.println("Missing = "+output);
        }
    }
}
