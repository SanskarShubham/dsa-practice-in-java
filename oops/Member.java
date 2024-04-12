/**
 * Employee
 */

    // Create a class named 'Member' having the following attributes:
    // Data Attributes of Member Class
    // 1 - Name
    // 2 - Age
    // 3 - Phone number
    // 4 - Address
    // 5 - Salary
    // It also has a method named 'printSalary' which prints the salary of the members.
    // Two classes 'Employee' and 'Manager' inherits the 'Member' class. The
    // 'Employee' and 'Manager' classes have attributes 'specialization' and
    // 'department' respectively.
    // Both these classes will also have a method print_details.
    // Print_details of Employee class will print name & 'specialization' and will
    // also call the printSalary method.
    // Print_details of Manager class will print name & 'department' and will also
    // call the printSalary method.

    // Now, assign name, age, phone number, address and salary to an employee and a
    // manager by making an object of both of these classes.
    // and print the same.
class Employee extends Member {
    String specialization;

    // constructor
    public Employee(String name, int age, String phone_number, int address, int salary, String specialization) {
        super(name, age, phone_number, address, salary);
        this.specialization = specialization;
    }

    public void print_details() {
        System.out.println(this.name + " " + this.specialization);
    }
}

class Manager extends Member {
    String department;

    // constructor
    public Manager(String name, int age, String phone_number, int address, int salary, String specialization,
            String department) {
        super(name, age, phone_number, address, salary);
        this.department = department;
    }

    public void print_details() {
        System.out.println(this.name + " " + this.department);
        super.printSalary();
    }
}

public class Member {
 
    String name;
    int age, salary;
    String phone_number;
    int address;

    public Member(String name, int age, String phone_number, int address, int salary) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println(this.salary);
    }

    public static void main(String[] args) {

        Employee employee = new Employee("John", 25, "1234567890", 123456, 50000, "Software Engineer");
        employee.print_details();

    }
}
