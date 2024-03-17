class Rotate_array14 {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] resArr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int pos = (i + k) % n;
            resArr[pos] = arr[i];
        }

        for (int i = 0; i < resArr.length; i++) {
            System.out.print(resArr[i]+" ");          
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 11;
        rotate(arr, k);
    }
}
