package bit_manipulation03;

import java.util.Arrays;

class Rotate_array {
    public static void rotate(int[] arr, int k) {
        // brute force method
        int rotate = k % arr.length;
        for (int i = 0; i < rotate; i++) {
            int key = arr[0];
            for (int j = 1; j < arr.length; j++) {
                    int temp = arr[j];
                    arr[j] = key;
                    key = temp;
            }        
            arr[0] = key;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 8;
        rotate(arr, k);
    }
}