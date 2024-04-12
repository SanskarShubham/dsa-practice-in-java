public class Count_objects {
    static int  count = 0;

    public Count_objects(){
        count++;
    }
    public static void print_count(){
        System.out.println(count);
    }

    public static void main(String[] args) {
           Count_objects c1 =  new Count_objects();
           Count_objects c2 =  new Count_objects();
           
        print_count();           
    }
}
