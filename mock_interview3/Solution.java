
class Solution{
    public static void reverse (String s) {
        StringBuilder str = new StringBuilder(s); 
        
        for (int i = 0; i < str.length()/2; i++) {
            int front = i;
            int last = str.length()-i-1;

            char frontChar = str.charAt(front);
            char lastChar = str.charAt(last);

            str.setCharAt(front, lastChar);
            str.setCharAt(last, frontChar);
        }
            String res   = str.toString();
            System.out.println(res);
            System.out.println(str);
            // return res;
        
    }

    public static void main(String[] args) {
        reverse("Sanskar Ojha");
    }
}