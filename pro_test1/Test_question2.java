package pro_test1;

public class Test_question2 {
    public static boolean count_swap(String s1, String s2) {
        if (s1.equals(s2) || s1.length() != s2.length()) {
            return false;
        }
        int indices[] = new int[2];
        int i = 0;
        int diffCount = 0;
        while (i < s1.length()) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (diffCount >= 2) {
                    return false;
                }
                indices[diffCount++] = i;
            }
            i++;
        }
        if (s1.charAt(indices[0]) != s2.charAt(indices[1]) && s1.charAt(indices[1]) != s2.charAt(indices[0])) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "sharpener";
        String s2 = "pharpener";
        boolean res = count_swap(s1, s2);
        System.out.println(res);

    }
}
