package apna_coolege.recursion;

public class First_and_last_occurence {

    public static void find_occurrence(String str, char target, int idx, int first, int last){
        if (idx == str.length()) {
            System.out.println("first = "+first+" last = "+ last );
            return;
        }
        if (str.charAt(idx) == target) {
            if (first == -1) {
                first = idx;   
            }else{
                last = idx;
            }
        }
        find_occurrence(str, target, idx+1, first, last);
        

    }
    
    public static void main(String[] args) {
            String str = "asdfdsafgasdfgaag";
            find_occurrence(str,'a',0,-1,-1);
            
    }
}
