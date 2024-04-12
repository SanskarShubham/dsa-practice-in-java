

public class Student_03 {
    /*
     * Create a class named 'Student' with String variable 'name' and integer
     * variable 'roll_no'.
     * Create a constructor through which you can assign values through objects on
     * creation of objects.
     * if No value is passed through object then by default name should be
     * initialized to "john" and roll_no as 2
     */

    String name;
    int roll_no;

    // Default constructor
    Student_03() {
        this.name = "john";
        this.roll_no = 2;
    }

    Student_03(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public static void main(String[] args) {
        Student_03 s1 = new Student_03();
        Student_03 s2 = new Student_03("shubham", 1);
        System.out.println(s1.name);
        System.out.println(s1.roll_no);
    System.out.println(s2.name);
        System.out.println(s2.roll_no);
    }
}
