public class Employee {
    String name;
    int id;
    double salary;
    int age;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Employee ID :" + id);
        System.out.println("Employee Name :" + name);
        System.out.println("Employee Salary :" + salary);
        System.out.println("Employee Age :" + age);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John", 1, 5000.0);
        emp.displayInfo();
    }
}