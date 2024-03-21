/**
 * Print_hollow_pyramid
 */
public class Print_hollow_pyramid {

    public static void main(String[] args) {
        int N = 5;
        // Loop through each row
        for (int i = 1; i <= N; i++) {
            // Print leading spaces
            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }
            // Print stars for the hollow pyramid
            if (i == 1 || i == N) {
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= (2 * i - 1); j++) {
                    if (j == 1 || j == (2 * i - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}