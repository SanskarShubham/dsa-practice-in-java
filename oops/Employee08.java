public class Employee08 {
    int salary,working_hours;
    public void getInfo(int salary, int working_hours){
        this.salary = salary;
        this.working_hours = working_hours;
    }
     public void addSalary(){
        if(this.salary < 500){
            this.salary += 5;
        }
    }
    
    public void addWork(){
        if (this.working_hours > 6) {
            this.salary +=5;
        }
    }
    
    public static void main(String[] args) {
            
    }
}
