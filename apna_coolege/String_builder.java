public class String_builder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("shubham ojha");

        // name.charAt(0);
        // System.out.println(name.charAt(0));
        // name.insert(0, "Mr. ");
        // System.out.println(name);
        // name.setCharAt(8, 'O');
        // System.out.println(name);
        // name.delete(0, 4);
        // System.out.println(name);
        // name.append(" g");
        // System.out.println(name);

        // reverse string
        for (int i = 0; i < name.length()/2; i++) {
            int front = i;
            int back = name.length() - 1 -i;
            
            char frontChar = name.charAt(front);
            char backChar = name.charAt(back);

            name.setCharAt(front, backChar);
            name.setCharAt(back, frontChar);
        }
        System.out.println(name);
        
    }
}
