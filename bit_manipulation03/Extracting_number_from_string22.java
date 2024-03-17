/**
 * Extracting_number_from_string
 */
public class Extracting_number_from_string22 {

    public static void extract_number(String s) {
        int i = 0;

        while (i < s.length()) {
            int x = s.charAt(i);
            if (x >= 48 && x <= 57) {
                int j = i;
                while (j < s.length() && (int) s.charAt(j) >= 48 && (int) s.charAt(j) <= 57) {
                    j++;
                }
                System.out.println(s.substring(i, j));
                i = j;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        String s = "abv345fjjf123tyir45jf6th";
        // int res=
        extract_number(s);
        // System.out.println(res);
    }
}