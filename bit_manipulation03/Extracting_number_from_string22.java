package bit_manipulation03;

import java.util.ArrayList;
import java.util.List;

/**
 * Extracting_number_from_string
 */
public class Extracting_number_from_string22 {

    public static List<String> extract_number(String s) {

        List<String> res = new ArrayList<String>();
        int i = 0;
        int j = 0;
        while (i < s.length()) {

            if ((int) s.charAt(i) > 47 && (int) s.charAt(i) < 58) {

                j = i;
                while (j < s.length() && (int) s.charAt(j) > 47 && (int) s.charAt(j) < 58) {
                    j++;
                }

                String num = s.substring(i, j);
                i = j;
                res.add(num);
            } else {

                i++;
            }
        }
        return res;

        // int i = 0;

        // while (i < s.length()) {
        // int x = s.charAt(i);
        // if (x >= 48 && x <= 57) {
        // int j = i;
        // while (j < s.length() && (int) s.charAt(j) >= 48 && (int) s.charAt(j) <= 57)
        // {
        // j++;
        // }
        // System.out.println(s.substring(i, j));
        // i = j;
        // } else {
        // i++;
        // }
        // }
    }

    public static void main(String[] args) {
        String s = "abv345fjjf123tyir45jf6th";
        // int res=
        List<String> res = extract_number(s);
        System.out.println(res.toString());
        // System.out.println(res);
    }
}