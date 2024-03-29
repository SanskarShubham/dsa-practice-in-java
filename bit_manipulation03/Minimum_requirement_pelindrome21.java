package bit_manipulation03;

public class Minimum_requirement_pelindrome21 {

    /**
     * Function to check if a given string is a palindrome and return the minimum 
     * number of characters to be removed to make it a palindrome.
     * 
     * @param  s	The string to check
     * @return    	The minimum number of characters to be removed
     */
    public static int check_pelindrome(String s) {
        /* Length of the string */
        int n = s.length();

        /* Variable to store the result */
        int res = 0;

        /* Loop to check for palindrome */
        for (int j = 0; j < s.length(); j++) {

            /* Flag to check if palindrome */
            boolean isPalindrome = true;

            /* Loop to check for palindrome */
            for (int i = 0; i < (n)/2; i++) {

                /* Check if characters at i and n-j-1-i are same */
                if (s.charAt(i) != s.charAt(n-j-1-i)) {

                    /* If not same set flag to false and break */
                    isPalindrome = false;
                    break;
                }           
             } 
            
            /* If palindrome is found, set result and break */
             if (isPalindrome) {
                res = j;
                break; 
             }      
        }
        
        /* Return the result */
        return res; 
    }

    public static void main(String[] args) {
        String s = "abbaqrtw";
       int res=  check_pelindrome(s);
       System.out.println(res);
    }
}
