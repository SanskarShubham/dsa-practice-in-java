public class Employee07 {
    String name, address;
    int year_of_joining;

    public Employee07(String name, int year_of_joining, String address) {
        this.name = name;
        this.year_of_joining = year_of_joining;
        this.address = address;
    }

    public void printDetails(){
        System.out.println(this.name+" "+this.year_of_joining+" " +this.address);
    }

    public static void main(String[] args) {
        Employee07 e1 = new Employee07("Sanskar",2024,"Nayagaon");
        e1.printDetails();
    }
}
