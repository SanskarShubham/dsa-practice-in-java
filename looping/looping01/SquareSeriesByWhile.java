package looping01;
import java.util.Scanner;

public class SquareSeriesByWhile {
    public static void printSquare(int n){
            int i= 1;
            while((i*i) <= n ){
                System.out.println((int)Math.pow(i,2));
                i++;
            }
    }
    public static void main(String args[]){
        System.out.print("enter the value of n");
        try (Scanner sc = new Scanner(System.in)){
        
           int n=  sc.nextInt();
           printSquare(n);
        } 
    }
}
