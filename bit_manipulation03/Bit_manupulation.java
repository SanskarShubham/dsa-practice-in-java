public class Bit_manupulation {
    
    public static void main(String[] args) {
        int n =5;
        int pos = 0;
        int bitMask  = 1 << pos;
       int notbitMask =   ~bitMask;
            // get bit
        //  if ((bitMask & n) == 0 ) {
        //     System.out.println(0);
        //  }else{
        //     System.out.println(1);
        //  }

            
        // set bit 
        // n  =  n | pos;
        // System.out.println(n);

        n = (n & notbitMask);
        System.out.println(n);
        
    }
}
