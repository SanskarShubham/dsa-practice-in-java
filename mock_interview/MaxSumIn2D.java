package mock_interview;

public class MaxSumIn2D {
    public static void findMaxSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                  sum += arr[i][j];  
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
    
    public static void main(String[] args) {
        int [][] arr ={{1,5},{7,3},{3,5}};
        findMaxSum(arr);
    }
}
