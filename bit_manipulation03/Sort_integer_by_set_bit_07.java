import java.util.Arrays;

public class Sort_integer_by_set_bit_07 {

    public static int count_bit(int n){
      int count = 0;
      while(n > 0){
        count += (n & 1);
        n >>=1;
      }
      return count;
    }

    public static int[] sort_arr(int[] arr){
        Arrays.sort(arr);
        int[] bitsArr = new int[arr.length];
        for (int i = 0; i < bitsArr.length; i++) {
                bitsArr[i] = count_bit(arr[i]);            
        }

        for (int i = 0; i < bitsArr.length; i++) {
            for (int j = 0; j < bitsArr.length-i-1; j++) {
                    if (bitsArr[j] > bitsArr[j+1]) {
                        // main arr sort
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        // bits arr sort 
                        temp = bitsArr[j];
                        bitsArr[j] = bitsArr[j+1];
                        bitsArr[j+1] = temp;
                    }    
            }
        }
        // System.out.println("bits array:" + Arrays.toString(bitsArr));
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1024,512,256,128,64,32,16,8,4,2,1};
        int[] res= sort_arr(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }

    }
    
}
