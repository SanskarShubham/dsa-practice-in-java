import java.util.Scanner;

public class Count_bad_pair {

       public static int bad_pair(int[] arr){
           int count = 0 ;
           for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                     count++;                                  
                }
                
            }
           }
           return count;
       }
    
        public static void main(String[] args) {
          System.out.println("Enter the no of elment in array:");
          try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

              int[] arr = new int[n];
              for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
              }
            int out =  bad_pair(arr);
            System.out.println("Ans= "+out);
        }
         }
    }

