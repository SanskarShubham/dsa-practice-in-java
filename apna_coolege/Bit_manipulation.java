public class Bit_manipulation {
    public static void main(String[] args) {
        int a = 5;
        // 0111



        int bitMask = 1;
        bitMask <<=1;
       // bitMask = ~bitMask;
        // System.out.println(Integer.toBinaryString(bitMask));           

         int res = bitMask | a;
         System.out.println(Integer.toBinaryString(res));           
        

    //     a = bitMask | a;
    //     System.out.println(Integer.toBinaryString(a));
    //    if ((bitMask & a) != 0) {
    //     System.out.println("Bit is 1 ");
    //    }else{
    //     System.out.println("Bit is 0");
    //    }
      
    }
}
