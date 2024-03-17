/**
 * FindMissingNumber
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        int n = 123;

        int remainder  = n % 69;
        if (remainder ==0) {
            System.out.println(0);
        }else{
           System.out.println(69-remainder);
        }
        

    }
}

