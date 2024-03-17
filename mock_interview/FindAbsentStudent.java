public class FindAbsentStudent {
    
    public static void main(String[] args) {
        int[] arr = {0,1};
        int[] newArr = new int[arr.length+1];
        int res = -1;

         for (int i = 0; i < arr.length; i++) {
            newArr[arr[i]] =arr[i];
         }   
         for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] ==0) {
                res = i;
                
            }
         }
         System.out.println(res);
         
    }
}
