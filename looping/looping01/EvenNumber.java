package looping01;
import java.util.Scanner;

public class EvenNumber {


    public static void evenNumber(int n){
        for(int i=2;i<=n; i=i+2){
            if ((i%4) !=0) {
                
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter The Number");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            evenNumber(n);
        }
    }
}


