///========== User's Code Starts Here ==========
//Write the code Below
class PARENT{
   public void print(){
        System.out.println( "this is a parent class");
    }    
}

class CHILD extends PARENT{
     public void print(){
        System.out.println( "this is a child class");
        super.print();
    }    
}


//Do Not change the Below Main Method


public class Inheritance_02 {
    public static void main(String args[]) {
        PARENT obj_parent = new PARENT();
        obj_parent.print();
        
        CHILD obj_child = new CHILD();
         obj_child.print();
      
    }
}
//====