package apna_coolege.recursion;

public class PrintKeyboardCombination {
    
    public static String[] arr= {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void print(String str, int idx, String combination){
        if (idx == str.length()) {
            System.out.println(combination);
            return;
            
        }
            char curChar = str.charAt(idx);
            
            String mapping = arr[curChar -'0'];

            for (int i = 0; i < mapping.length(); i++) {
               print(str, idx+1, combination+mapping.charAt(i)); 
            }
    }

    public static void main(String[] args) {
        print("23", 0, "");
    }
}
