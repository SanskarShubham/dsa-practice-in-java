class Member{
    String name;
    int age;
    String phone_number;
    String address;
    int salary;
    
    public void printSalary(){
        System.out.println(this.salary);
    }
}

class Employee extends Member{
    String specialization;
   
    public Employee(String  name, int age, String phone_number, String address,int salary,String specialization){
    this.name = name;
    this.age = age;
    this.phone_number = phone_number;
    this.address = address;
    this.salary = salary;
    this.specialization = specialization;
    
    }
    public void print_details(){
        System.out.println(this.name);
        System.out.println(this.specialization);
        this.printSalary();
    }
}
class Manager extends Member{
    
   
    String department;
    public Manager(String  name, int age, String phone_number, String address,int salary,String department){
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
        this.department = department;
        
        }
    
    
    public void print_details(){
        System.out.println(this.name);
        System.out.println(this.department);
        this.printSalary();
    }
}

//Do Not change the Below Main Method


public class Oops_task_8 {
    public static void main(String args[]) {
        Employee obj = new Employee("Ram",25,"7003","Bangalore",1000,"cse");
        obj.print_details();
        
        Employee obj1 = new Employee("Shyam",250,"8098","Chennai",2000,"civil");
        obj1.print_details();
        
        Manager obj_Man = new Manager("babu",100,"1234","Bangalore",1000,"JP");
        obj_Man.print_details();
        
        Manager obj1_Man = new Manager("Rao",250,"456","Kerala",3000,"GC");
        obj1_Man.print_details();

    }
}