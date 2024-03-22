package bit_manipulation03;

import java.util.Arrays;

class Rotate_array14 {
    public static void rotate(int[] arr, int k) {

           int n = arr.length;
           int rotate = k%n;
           int resArr[] =  new int[n];
           for (int i = 0; i < arr.length; i++) {
                int new_index =  (i+rotate) % n;
                resArr[new_index] = arr[i]; 
           }
           System.out.println(Arrays.toString(resArr));
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 8;
        rotate(arr, k);
    }
}
