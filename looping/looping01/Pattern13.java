package looping01;

public class Pattern13 {

   
    public static void main(String[] args) {
    //    int n = 37;
     int[] arr = {1,1,1,1,1};
     int[] resArr =new int[arr.length];
      
     for (int i = 0; i < arr.length; i++) {
        int sum = 0;
        for (int j = 0; j <= i; j++) {
            sum += arr[j];
        }
        resArr[i] = sum;
     }
     for (int i : resArr) {
        System.out.println(i);
     }
            // while (count <= n) {
                
            // }
     

       //     for (int i = 0; i < n; i++) {
    //         for (int j = 1; j < n-i; j++) {
    //             System.out.print(' ');
    //         }
    //         for (int j = 1; j <=2*i+1 ; j++) {
    //                 System.out.print('*');          
    //         }
    //         System.out.println();
    //     }
    //      for (int i = n-1; i >= 0; i--) {
    //         for (int j = 1; j < n-i; j++) {
    //             System.out.print(' ');
    //         }
    //         for (int j = 1; j <=2*i+1 ; j++) {
    //                 System.out.print('*');          
    //         }
    //         System.out.println();
    //     }
     }
    
}
