package bit_manipulation03;

public class Validate_string18 {

    public static boolean reverse(String s) {
        int n = s.length();
        for (int i = 0; i < n/2; i++) {
                if (s.charAt(i) != s.charAt(n-1-i)) {
                        return false;
                }
        }

        return true;

        // String revString = "";
        // for (int i = s.length() - 1; i >= 0; i--) {
        //     revString += s.charAt(i);
        // }
        // if (s.equals(revString)) {
        //     System.out.print("True");
        // } else {
        //     System.out.print("False");
        // }

    }

    public static void main(String[] args) {
        boolean res = reverse("sharpener");
        System.out.println(res);
    }

}
