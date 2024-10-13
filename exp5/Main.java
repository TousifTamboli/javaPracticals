import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Example of using try, catch, finally
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            if (age < 0) {
                // Throw custom exception for invalid age
                throw new InvalidAgeException("Age cannot be negative.");
            } else if (age < 18) {
                System.out.println("You are a minor.");
            } else {
                System.out.println("You are an adult.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
            scanner.close(); // Ensure the scanner is closed
        }

        // Demonstrating multiple catch blocks and nested try
        try {
            // Nested try
            try {
                int[] numbers = {1, 2, 3};
                System.out.println("Accessing invalid index: " + numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Out of Bounds: " + e.getMessage());
            }

            // Another exception handling
            String str = null;
            System.out.println("String length: " + str.length()); // This will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Nested try execution completed.");
        }
    }
}
