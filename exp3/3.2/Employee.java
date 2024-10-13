// Employee.java

public class Employee {
    // Fields
    String name;
    int id;
    double salary;

    // Default constructor
    public Employee() {
        this.name = "Unknown";
        this.id = 0;
        this.salary = 0.0;
    }

    // Parameterized constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: $" + salary);
    }

    // Method overloading (different parameter types and numbers)
    public void displayDetails(String department) {
        System.out.println("Department: " + department);
    }

    public void displayDetails(String department, String position) {
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
    }
}