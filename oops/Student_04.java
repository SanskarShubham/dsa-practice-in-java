package oops;

public class Student_04 {
    String name;
    int roll_no;

    // Default constructor
    Student_04() {
        this.name = "john";
        this.roll_no = 2;
    }

    Student_04(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
    public  void display() {
        System.out.println(this.name);
        System.out.println(this.roll_no);
        
    }
       public static void main(String[] args) {
        Student_04 s2 = new Student_04("Shubham", 1);
        s2.display(); 
    }
}
