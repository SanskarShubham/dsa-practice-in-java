package pro_test1;

public class Test_question3self {

    public static int minWork(int[] arr) {
        int n = arr.length;
        int totalWork = 0; // 5+3+1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int pensToDistribute = Math.abs(arr[i]);// 1
                int j = i - 1; // 0
                while (pensToDistribute > 0 && j >= 0) {
                    if (arr[j] > 0) {
                        int transfer = Math.min(arr[j], pensToDistribute);
                        totalWork += transfer * (i - j);
                        arr[j] -= transfer;
                        pensToDistribute -= transfer;
                    }
                    j--;
                }

                j = i + 1;
                while (pensToDistribute > 0 && j < n) {
                    if (arr[j] > 0) {
                        int transfer = Math.min(arr[j], pensToDistribute);
                        totalWork += transfer * (j - i);
                        arr[j] -= transfer;
                        pensToDistribute -= transfer;        
                    }
                    j++;
                }

            }
        }
        return totalWork;
    }

    public static void main(String[] args) {
        // int[] arr1 = { 0, -4, 0, -3, 1 };
        int[] arr1 = { 5, -4, 1, -3, 1 };
        int[] arr2 = { -1000, -1000, -1000, 1000, 1000, 1000 };

        System.out.println("Example 1: " + minWork(arr1)); // Output: 9
        System.out.println("Example 2: " + minWork(arr2)); // Output: 9000
    }
}
