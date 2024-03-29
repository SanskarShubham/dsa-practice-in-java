package bit_manipulation03;

import java.util.Arrays;

public class Failed_student_at_last23 {
    
    public static void rotate(int[] arr) {

            int i = 0;
            int j = 0;

            while (i < arr.length && j < arr.length  ) {
                if (arr[i] > 0 ) {
                    i++;
                    j++; 
                }else{
                    while (arr[j] < 0 && j < arr.length) {
                         j++;                      
                    }
                    int temp = arr[j];
                    arr[j]  =arr[i];
                    arr[i] = temp;
                } 
            }

            System.out.println(Arrays.toString(arr));















        // int i=0;
        // int j=0;
        // while (i < arr.length && j < arr.length) {
        //     if (arr[j] > 0) {
        //         i++;
        //         j++;
                
        //     }else{
        //         while (i  < arr.length && arr[i] < 0 ) {
        //             i++;
        //         }
        //         int temp = arr[j];
        //         arr[j]= arr[i];
        //         arr[i]= temp;
        //     }
        // }
        // for (int j2 = 0; j2 < arr.length; j2++) {
        //     System.out.print(arr[j2]+" ");
        // }
        
    }

    public static void main(String[] args) {
        
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6 };
      
        rotate(arr);
    }
}
