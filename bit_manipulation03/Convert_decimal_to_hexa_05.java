import java.util.Scanner;

public class Convert_decimal_to_hexa_05 {
    public static void convert_to_hexa(int n) {
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == Integer.MIN_VALUE) {
            System.out.println("80000000");
        }

        int[] arr = new int[8];
        int temp = Math.abs(n);
        int nCounter = 0;
        while (temp > 0) {
            int rem = temp % 16;
            System.out.println(rem);
            arr[nCounter] = rem;
            nCounter++;
            temp /= 16;
        }
        if (n < 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = 15 - arr[i];
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] + 1 == 16) {
                    arr[i] = 0;
                } else {
                    arr[i] += 1;
                }
            }
        }
        int pos = 7;

        while(arr[pos] ==0) {
            pos--;
        }
            String res = "";
        for (int i = pos; i >= 0; i--) {
            if (arr[i] >9) {
                res += (char)(arr[i]+87);                
            }else{
                res+= Integer.toString(arr[i]);
                break;
            }

        }
        System.out.println(res);
        // int[] arr = new int[8];
        // int nCounter = 0;
        // int temp = Math.abs(n);
        // while (temp != 0) {
        // int rem = temp % 16 ;
        // arr[nCounter]= rem;
        // nCounter++;

        // temp= temp/16;
        // }
        // if (n < 0) {
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = 15 - arr[i];
        // }
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i]+1 >15) {
        // arr[i] = 0;
        // }else{
        // arr[i] = arr[i]+1;
        // break;
        // }
        // }
        // }
        // int pos = 7;
        // while (arr[pos] ==0) {
        // pos--;

        // }
        // String res = "";
        // for (int i = pos; i >= 0 ; i--) {
        // if (arr[i] > 9) {
        // res = res+(char)(arr[i]+87);
        // System.out.print((char)(arr[i]+55));
        // }else{
        // res= res+Integer.toString(arr[i]);
        // System.out.print(arr[i]);
        // }
        // }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            convert_to_hexa(n);
        }
    }
}
