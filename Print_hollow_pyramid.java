/**
 * Print_hollow_pyramid
 */
public class Print_hollow_pyramid {

    public static void main(String[] args) {
        int N = 5;
       for (int i = 1; i <= N; i++) {
            for (int j = i; j < N; j++) {
                    System.out.print(" ");                
            }  
            for (int j = 1; j <= (2*i -1); j++) {
                if(j ==1 || i==N || j==(2*i -1)){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }    
            }
            System.out.println();
                  
       }
    }
}