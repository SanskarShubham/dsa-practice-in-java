package looping;

public class Pattern9 {
    public static void main(String[] args) {
        // Upper part
        for (int i = 1; i <= 4; i++) {
            // First Part
            for (int j = 1; j <= i; j++) {
                 if (i ==1 || j==1 || j==4 || i==j) {
                    
                    System.out.print('*');
                }else{

                    System.out.print(' ');
                }

            }
            // Print Space
            for (int j = 1; j <= 2 * (4 - i); j++) {
                System.out.print(' ');
            }
            // Second part
            for (int j = 1; j <= i; j++) {
               if (i ==1 || j==1 || j==4 || i==j) {
                    
                    System.out.print('*');
                }else{

                    System.out.print(' ');
                }
            }
            // Change Line
            System.out.println();
        }

        // Lower Part
        for (int i = 4; i >=1; i--) { 
            // First Part
            for (int j = 1; j <= i; j++) {
               if (i ==1 || j==1 || j==4 || i==j) {
                    
                    System.out.print('*');
                }else{

                    System.out.print(' ');
                }
            }
            // Print Space
            for (int j = 1; j <= 2*(4-i); j++) {    
                System.out.print(' ');
            }
            // Second Part
            for (int j = 1; j <= i; j++) {
               if (i ==1 || j==1 || j==4 || i==j) {
                    
                    System.out.print('*');
                }else{

                    System.out.print(' ');
                }
            }
            // Change Line
            System.out.println();
            
        }
                // *      *
                // **    **
                // ***  ***
                // ********
                // ********
                // ***  ***
                // **    **
                // *      *

                    // *      *
                    // **    **
                    // * *  * *
                    // *  **  *
                    // *  **  *
                    // * *  * *
                    // **    **
                    // *      *
    }
}
