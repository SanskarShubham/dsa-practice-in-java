public class Test_question2 {
    public static boolean count_swap(String s1, String s2) {
        if (s1.equals(s2)) {
            return false;
        }
        int indices[] = new int[2];
        int diffCount = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if(diffCount >= 2){
                    return false;
                }    
                indices[diffCount++] = i;
            }
        }
         
        if (diffCount ==2 && s1.charAt(indices[0]) ==s2.charAt(indices[1]) && s1.charAt(indices[1]) ==s2.charAt(indices[0]) ) {
                return true;         
        }else{
           return false;
        }

    }

    public static void main(String[] args) {
        String s1 = "sharpener";
        String s2 = "pharsener";
       boolean res=  count_swap(s1, s2);
       System.out.println(res);

    }
}
