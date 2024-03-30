package pro_test1;

class Test_question3{
    public static int minWork(int[] arr) {
        int n = arr.length;
        int totalWork = 0;

        // Iterate through each student's pen situation
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) { // If the current student has extra pens
                int pensToDistribute = Math.abs(arr[i]); // Calculate how many pens need to be distributed
                
                // Check for students to the left of the current student
                int j = i - 1; 
                while (pensToDistribute > 0 && j >= 0) { // Iterate while there are pens to distribute and valid students to distribute to
                    if (arr[j] > 0) { // If the adjacent student to the left needs pens
                        int transfer = Math.min(pensToDistribute, arr[j]); // Determine how many pens can be transferred
                        totalWork += transfer * (i - j); // Calculate the work required for the transfer
                        arr[j] -= transfer; // Update the number of pens the adjacent student has
                        pensToDistribute -= transfer; // Update the number of pens left to distribute
                    }
                    j--; // Move to the next student to the left
                }
                
                // Check for students to the right of the current student (similar logic as above)
                j = i + 1; 
                while (pensToDistribute > 0 && j < n) {
                    if (arr[j] > 0) {
                        int transfer = Math.min(pensToDistribute, arr[j]);
                        totalWork += transfer * (j - i);
                        arr[j] -= transfer;
                        pensToDistribute -= transfer;
                    }
                    j++;
                }
            }
        }

        return totalWork; // Return the total work required
    }

    public static void main(String[] args) {
        int[] arr1 = {5, -4, 1, -3, 1};
        int[] arr2 = {-1000, -1000, -1000, 1000, 1000, 1000};

        System.out.println("Example 1: " + minWork(arr1)); // Output: 9
        System.out.println("Example 2: " + minWork(arr2)); // Output: 9000
    }
    }
    

