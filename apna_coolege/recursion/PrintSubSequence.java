package apna_coolege.recursion;

public class PrintSubSequence {
    
    public static void print(String str, int idx,String res){
        if (idx == str.length()) {
            System.out.println(res);
            return;
        }
        char curChar = str.charAt(idx); 
        // to be
        print(str, idx+1, res+curChar);
        // to not be
        print(str, idx+1, res);
    }

    public static void main(String[] args) {
        print("abcd", 0, "");
    }
}
