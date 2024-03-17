import java.util.Scanner;

public class Selection_sort {
     public  int[] sort_array(int[] arr){
      
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }

            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i]= temp;
        }
        return arr;

        // for (int i = 0; i < arr.length; i++) {
        //     int min = i;
        //     for (int j = i+1; j < arr.length; j++) {
        //           if (arr[j] < arr[min] ) {
        //            min = j ; 
        //           }             
        //             int temp = arr[i];
        //             arr[i]= arr[min];
        //             arr[min] = temp;
        //     }
        // }

        // return arr;
    }
    public static void main(String[] args) {
        Selection_sort sort = new Selection_sort();
        System.out.println("enter the no of element in array:");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("enter the elements of array:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                
            }
            int[] out =  sort.sort_array(arr);
            for (int i = 0; i < out.length; i++) {
                System.out.println(out[i]);
                
            }
        }
    }
}
