import java.util.Scanner;

public class Count_wealth {
    public static int calculate_wealth(int[][] arr) {
        int max =arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            int sum =0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (max < sum) {
               max = sum; 
            }
        }
        return max;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter no of row and coloumn :");
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] arr = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                   arr[i][j]= sc.nextInt();
                }
            } 
            int res=  calculate_wealth(arr);   
            System.out.println(res);
        }
       
    }
}
