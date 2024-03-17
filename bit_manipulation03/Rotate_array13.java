class Rotate_array {

    public static void rotate(int[] arr, int k) {
        k = k % arr.length;
        for (int j = 0; j < k; j++) {
            int val = arr[0];
            for (int i = 1; i < arr.length; i++) {
                int temp = val;
                val = arr[i];
                arr[i] = temp;
            }
            arr[0] = val;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }

    public static void main(String[] args) {
            int[] arr  = {1,2,3,4,5};
            int k =6;
            rotate(arr,k);
    }
}