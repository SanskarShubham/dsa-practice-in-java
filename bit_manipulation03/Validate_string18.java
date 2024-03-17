public class Validate_string18 {

    public static void reverse(String s) {
        String revString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            revString += s.charAt(i);
        }
        if (s.equals(revString)) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }

    }

    public static void main(String[] args) {
        reverse("madam");
    }

}
