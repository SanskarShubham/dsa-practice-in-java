public class Minimum_requirement_pelindrome21 {

    public static int check_pelindrome(String s) {
        int res = 0;
        for (int j = 0; j < s.length(); j++) {

            boolean flag = true;
            for (int i = 0; i < (s.length() -j) /2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - j-i)) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                res = j;
                break;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        String s = "kfeabbaefkkkk";
       int res=  check_pelindrome(s);
       System.out.println(res);
    }
}
