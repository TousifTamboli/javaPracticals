// Main class to test constructors and overloading
public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Employee employee1 = new Employee();
        employee1.displayDetails();
        
        // Using parameterized constructor
        Employee employee2 = new Employee("Alice", 101, 50000.0);
        employee2.displayDetails();

        // Method overloading
        employee2.displayDetails("IT");
        employee2.displayDetails("IT", "Developer");
    }
}