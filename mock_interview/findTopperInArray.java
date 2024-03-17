import java.util.ArrayList;
import java.util.List;

public class findTopperInArray {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0};
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {
            int key = arr[i];
            boolean flag = true;
            for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] > key) {
                            flag = false;                                
                    }
            }
            if (flag) {
                res.add(key);
            }
        }
        res.add(arr[arr.length-1]);
        for (Integer i : res) {
            System.out.println(i);
        }
    }
}
