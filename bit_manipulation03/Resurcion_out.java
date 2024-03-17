import java.util.Arrays;
import java.util.Comparator;

class Employee {
    private String Name;
    private double Salary;

    public Employee(String Name, double Salary) {
        this.Name = Name;
        this.Salary = Salary;
    }

    public String getName() {
        return Name;
    }

    public double getSalary() {
        return Salary;
    }
}

 class EmployeeSorter {
    public static void main(String[] args) {
        // Create 5 Employee objects with random values
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("John", 50000);
        employees[1] = new Employee("Alice", 60000);
        employees[2] = new Employee("Bob", 45000);
        employees[3] = new Employee("Eva", 75000);
        employees[4] = new Employee("David", 55000);

        // Sort employees in descending order based on Salary using a Comparator
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                // Compare in descending order
                return Double.compare(emp2.getSalary(), emp1.getSalary());
            }
        });

        // Print the names of employees in descending order of Salary
        System.out.println("Employees sorted in descending order of Salary:");
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        }
    }
}