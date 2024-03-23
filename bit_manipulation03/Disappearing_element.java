package bit_manipulation03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Disappearing_element {
    public static List<Integer> find_disapering_element(int arr[]) {
        // OPTIMISE WAY WITHOUT USING EXTRA ARRAY
        List<Integer> res = new ArrayList<>();

         int i = 0;

         while (i < arr.length) {
              int correct_index = arr[i] - 1;
              if (arr[correct_index] == arr[i]) {
                  i++;
              } else {
                  int temp = arr[i];
                  arr[i] = arr[correct_index];
                  arr[correct_index] = temp;
              }  
         }

         for (int j = 0; j < arr.length; j++) {
                if (arr[j] != j+1) {
                    res.add(j+1);
                }            
         }
         System.out.println(Arrays.toString(arr));

        // BRUTE FORCE METHOD (USING EXTRA ARRAY)
        
        // int newArr[] = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        //     newArr[arr[i] - 1] =  arr[i];
        // }
        // for (int i = 0; i < newArr.length; i++) {
        //     if (newArr[i] ==0) {
        //         res.add(i+1);
        //     }
        // }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = { 1,1 };
      List<Integer> res =  find_disapering_element(arr);
      System.out.println(res);
    }
}
