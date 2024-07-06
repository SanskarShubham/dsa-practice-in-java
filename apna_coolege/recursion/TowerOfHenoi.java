package apna_coolege.recursion;

/**
 * TowerOfHenoi
 */
public class TowerOfHenoi {
    public static void toi(int n, String src, String helper,String dest){
        if (n ==1) {
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);       
            return;
        }
        toi(n-1,src,dest,helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);   

        toi(n-1,helper,src,dest);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);   
    }

    public static void main(String[] args) {
        int n =3;
        toi(n, "S", "H", "D");

    }
}