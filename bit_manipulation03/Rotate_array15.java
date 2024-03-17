class Rotate_array15 {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int swap = 0;
        int val =arr[0];
        int current_index = 0;
            while (swap < n) {
                 int pos = (k+current_index)%n;
                 int temp = val;
                 val  =arr[pos];
                 current_index = pos;
                 arr[pos] =temp;
                 swap++;
                 for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");          
        }
        System.out.println();
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");          
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 13;
        rotate(arr, k);
    }
}
