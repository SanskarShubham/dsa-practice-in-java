import java.util.Arrays;

class Rotate_array {
    public static void rotate(int[] arr, int k) {
        // brute force method
        int rotate = k % arr.length;
        for (int i = 0; i < rotate; i++) {
            int val = arr[i];
            for (int j = 1; j < arr.length; j++) {
                int temp = arr[j];
                arr[j] = val;
                val = temp;
            }
            arr[0] = val;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 6;
        rotate(arr, k);
    }
}