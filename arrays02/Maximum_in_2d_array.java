import java.util.Scanner;

public class Maximum_in_2d_array {
    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("Enter the no of row and column :");
        try (Scanner sc = new Scanner(System.in);) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int arr[][] = new int[r][c];

            System.out.println("Enter the element of array :");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int out = findMax(arr);
            System.out.println("Max =" + out);
        }
    }
}
