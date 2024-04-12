/**
 * Shape
 */
 class Shape {
    public void printShape(){
        System.out.println("This is a shape");
    }
}
/**
 * Rectangle
 */
 class Rectangle extends Shape {
    public void print(){
        System.out.println("This is rectangle");
    }
}
class Circle extends Shape {
    public void print(){
        System.out.println("This is rectangle");
    }
}

public class Inheritance_in_java extends Rectangle {
    // Create a class named 'Shape' with a method to printShape "This is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangle" and "This is circle" respectively. Create a child class 'Square' of 'rectangle' having a method to printSquare "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.
    public void printSquare(){
        System.out.println("Square is a rectangle");
    }


    public static void main(String[] args) {
       Inheritance_in_java s1 = new Inheritance_in_java();
       
       s1.printShape();
       s1.print();
    }
}
