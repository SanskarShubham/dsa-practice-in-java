import java.util.Arrays;

public class Practice_java {

    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }

    public static int[] sort_arr(int[] arr) {
        Arrays.sort(arr);
        int[] bitsArr = new int[arr.length];
        for (int i = 0; i < bitsArr.length; i++) {
            bitsArr[i] = countSetBits(arr[i]);
        }

        for (int i = 0; i < bitsArr.length; i++) {
            for (int j = 0; j < bitsArr.length - i - 1; j++) {
                if (bitsArr[j] > bitsArr[j + 1]) {
                    // main arr sort
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // bits arr sort
                    temp = bitsArr[j];
                    bitsArr[j] = bitsArr[j + 1];
                    bitsArr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1 };
        int[] res = sort_arr(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }
}
