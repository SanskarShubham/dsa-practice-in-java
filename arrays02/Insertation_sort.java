import java.util.Scanner;

public class Insertation_sort {
    public static int[] sort_array(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] =key;
        }
        return arr;
    }
    public static void main(String[] args) {
         System.out.println("enter the no of element in array:");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("enter the elements of array:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                
            }
            int[] out =  sort_array(arr);
            for (int i = 0; i < out.length; i++) {
                System.out.println(out[i]);
                
            }
        }
    }
}
