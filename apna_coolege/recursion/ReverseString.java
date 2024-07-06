package apna_coolege.recursion;

public class ReverseString {
    
    public static void  printReverseStr(int idx,String str){
        if (idx < 0) {
            return;
        }

        System.out.print(str.charAt(idx));
        printReverseStr(idx-1, str);
    }
    public static void main(String[] args) {
        String str = "Simran";
        printReverseStr(str.length()-1, str);
    }
}
