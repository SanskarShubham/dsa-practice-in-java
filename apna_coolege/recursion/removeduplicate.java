package apna_coolege.recursion;

public class removeduplicate {
    public static boolean[] arr = new boolean[25];

    public static void remove(String str,int idx, String res){
        if (idx == str.length()) {
            System.out.println(res);
            return;
        }
        if (arr[str.charAt(idx) - 'a'] == false ) {
            res +=str.charAt(idx);
            arr[str.charAt(idx) - 'a'] = true;
        }
        remove(str, idx+1, res);
    }
    
    public static void main(String[] args) {
        remove("adfdsafafsdfasdfafasfdsafd", 0, "");
    }
}
