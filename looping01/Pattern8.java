package looping;

public class Pattern8 {
    public static void main(String[] args) {
        // int num = 1;
        // for (int i = 1; i <=5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num);
        // System.out.print(' ');
        // num++;
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                // if (i % 2 == 0) {
                //     if (j % 2 == 0) {
                //         System.out.print(1);
                //     } else {
                //         System.out.print(0);
                //     }
                // } else {
                //     if (j % 2 == 0) {
                //         System.out.print(0);
                //     } else {
                //         System.out.print(1);
                //     }
                // }
                if((i+j) % 2 ==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
