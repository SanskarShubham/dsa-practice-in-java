import java.util.Scanner;

public class Bubble_sort {
    public static int[] sort_array(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] < arr[j+1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 1; j < arr.length-i; j++) {
        //         if (arr[j-1] < arr[j]) {
        //             int temp = arr[j-1];
        //             arr[j-1] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
            
        // }
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
