

public class Bubble_sort {
    public static int[] sort_array(int[] arr){
           
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                    if (arr[j] > arr[j+1]) {
                        int temp =  arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }             
            }
        }
        return arr;

    }
    public static void main(String[] args) {
      int[] arr = {4,3,2,5,1};
      int[] res = sort_array(arr);
        for (int i = 0; i < res.length; i++) {
            
            System.out.println(res[i]);        
        }
    }
}