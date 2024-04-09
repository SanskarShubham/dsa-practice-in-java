public class Constructors_in_java {
    public String name;
    public int roll_no;

    public Constructors_in_java(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    Constructors_in_java() {
        this.name = "john";
        this.roll_no = 2;
    }

    public void printDetails() {
        System.out.println(this.name + " " + this.roll_no);
    }

    public static void main(String[] args) {
        Constructors_in_java student = new Constructors_in_java("Shubham",1);
        student.printDetails();
    }

}
