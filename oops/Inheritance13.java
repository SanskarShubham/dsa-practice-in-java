package oops;

/**
 * Create a class "PARENT" with a method print that prints "this is a parent
 * class" and its Child class "CHILD" with a method print that prints "this is a
 * child class". Now, create an object for each of the class and call
 * 
 * 1 - method of parent class by object of parent class
 * 
 * 2 - method of child class by object of child class
 * 
 * 3 - method of parent class by object of child class
 */
class PARENT {
    public void print() {
        System.out.println("this is a parent class");
    }

}

/**
 * CHILD
 */
class CHILD extends PARENT {
    public void print() {
        System.out.println("this is a child class");
        super.print();
    }

}

public class Inheritance13 {

    public static void main(String[] args) {
        PARENT p1 = new PARENT();
        CHILD c1 = new CHILD();

        p1.print();
        c1.print();
    }
}