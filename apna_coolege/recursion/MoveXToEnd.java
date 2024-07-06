package apna_coolege.recursion;

public class MoveXToEnd {
    public static String move(String str, String res,int idx, int count){
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                res += 'x';
            }
            return res;
        }
        if (str.charAt(idx) == 'x') {
            count++;
        }
        else{
            res += str.charAt(idx);
        }
        return move(str, res, idx+1, count);
    }
    
    public static void main(String[] args) {
            String str = "adsfsxddcxdsdxd";
            String res = move(str, "", 0, 0);
            System.out.println(res);


    }
}
