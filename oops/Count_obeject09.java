

public class Count_obeject09 {
       static int count = 0;

    Count_obeject09(){
            count++;
    }

    public static  void print_count(){
        System.out.println(count);
    }

    
    public static void main(String[] args) {

       new Count_obeject09();        
       new Count_obeject09();        
       new Count_obeject09();        
       new Count_obeject09(); 
            print_count();
    }
}
