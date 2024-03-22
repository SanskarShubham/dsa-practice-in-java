package bit_manipulation03;

import java.util.Arrays;

class Rotate_array15 {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        int current_index = 0;
        int cur_val = arr[0];
        k = k % n;
        int counter = 0;

        while (counter < n) {
            int new_index = (current_index + k) % n;
            int temp = arr[new_index];
            arr[new_index] = cur_val;
            cur_val = temp;
            current_index = new_index;
            counter++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 13;
        rotate(arr, k);
    }
}
