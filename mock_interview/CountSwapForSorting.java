package mock_interview;

public class CountSwapForSorting {
    public static void countSwap(int[] arr){
            int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] < arr[index]) {
                        index =j;
                    }                
            }
            if (index != i) {
                int smallNumber = arr[index];
                arr[index] = arr[i];
                arr[i] = smallNumber;
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int [] arr =  {10, 19, 6, 3, 5};
        countSwap(arr);
    }
}
