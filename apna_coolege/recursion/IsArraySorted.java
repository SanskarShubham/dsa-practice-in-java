package apna_coolege.recursion;

public class IsArraySorted {
    public static boolean check(int[] arr,int idx){
        if (idx == arr.length - 1) {
                return true;      
        }
        if (arr[idx] > arr[idx+1]) {
            return false;
        }
        return  check(arr, idx+1);  
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        boolean res = check(arr, 0);
        System.out.println(res);
    }
    
}
