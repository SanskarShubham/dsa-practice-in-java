public class Find_missing_element16 {

    public static void find_missing(int[] arr) {
        // METHOD 1
        // int[] resArr = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        // int current_index = arr[i] - 1;
        // resArr[current_index] = arr[i];
        // }
        // int index = 0;
        //============================
        int i = 0;
        int x = arr[0];
        while (i < arr.length) {

            int current_index = x - 1;

            if (arr[current_index] == x) {

                i++;
                if (i == arr.length) {
                    break;
                }
                x = arr[i];
                continue;
            }
            int temp = arr[current_index];
            arr[current_index] = x;
            x = temp;

        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] != k + 1) {
                System.out.print(k+1 + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 1, 5, 4, 4, 1, 5, 4 };
        find_missing(arr);
    }
}
