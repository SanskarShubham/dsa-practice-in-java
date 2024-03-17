/**
 * CountBadPair
 */
public class CountBadPair {

public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
        int count = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            if (i>j && arr[i] >arr[j]) {
                count++;
            }
        }
    }
    System.out.println(count);
}    
}