package mock_interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckNumberSumDevideBy5 {
    public static List<Integer> checkSharpee(int n) {

        
        int counter = 0;
        int num = 4;
        List<Integer> res = new ArrayList<>();
        while (counter < n) {
            int sum = 0;
            int temp = num; 
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum % 5 == 0) {
              
                res.add(num);
                counter++;
            }
            num++;
        }
        
       
        return res;

    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number of Sharpees:");
            int n = sc.nextInt();

            List<Integer> res = checkSharpee(n);
            System.out.println(res.toString());
        } catch (Exception e) {

        }
    }
}
