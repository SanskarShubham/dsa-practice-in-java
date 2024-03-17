public class Java_strings {
    
    public static void main(String[] args) {
        String name = "My name is shubham ojha";
        String name2 = "My name is shubham ojha n";

        System.out.println(name.length());
        System.out.println(name.charAt(8));
        System.out.println(name.substring(8));
        System.out.println(name.substring(0,3));
        System.out.println(name.indexOf('i'));
        System.out.println(name.compareTo(name2));
        System.out.println(name.concat(name2));
        System.out.println(name.contains("shubham"));

        }
}
