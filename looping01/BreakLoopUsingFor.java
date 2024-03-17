package looping;

import java.util.Scanner;

public class BreakLoopUsingFor {


    public static void breakLoop(int n,int m){
        for(int i=1;i<=n; i++){
            if (i==m) {
                break;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter The Number");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            breakLoop(n,m);
        }
    }
}


