import java.util.*;


public class Find_topper_student {
    public static LinkedList<Integer> find_topper(int[] arr){
        LinkedList<Integer> res = new LinkedList<>();

        for (int i = 0; i < arr.length-1; i++) {
            boolean isTopper = true;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    isTopper =false;
                }
            } 
            if (isTopper) {
                res.add(arr[i]);

            }
        }
        res.add(arr[arr.length - 1]);
        return res;
    }
    public static void main(String[] args) {
          System.out.println("Enter the no of elment in array:");
          try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

              int[] arr = new int[n];
              for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
              }
              LinkedList<Integer> res = find_topper(arr);
              for (int i = 0; i < res.size(); i++) {
                    System.out.println(res.get(i));                              
              }
    }
}
}
