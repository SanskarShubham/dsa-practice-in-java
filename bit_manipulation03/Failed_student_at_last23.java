public class Failed_student_at_last23 {
    
    public static void rotate(int[] arr) {
        int i=0;
        int j=0;
        while (i < arr.length && j < arr.length) {
            if (arr[j] > 0) {
                i++;
                j++;
                
            }else{
                while (i  < arr.length && arr[i] < 0 ) {
                    i++;
                }
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i]= temp;
            }
        }
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2]+" ");
        }
        
    }

    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4,-2, 3, -4, 5 };
      
        rotate(arr);
    }
}
