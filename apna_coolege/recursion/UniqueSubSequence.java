package apna_coolege.recursion;
import java.util.*;;
public class UniqueSubSequence {
    
    public static void print_sequence(String str,int idx,String res,HashSet<String> set){
        if (idx == str.length()) {
            if (!set.contains(res)) {
                set.add(res);
                System.out.println(res);
            }
            return;
        }
        char curChar = str.charAt(idx);
        // to be
        print_sequence(str, idx+1, res+curChar, set);
        // to not be
        print_sequence(str, idx+1, res, set);

    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        
        print_sequence("aaa", 0, "", set);
    }
}
