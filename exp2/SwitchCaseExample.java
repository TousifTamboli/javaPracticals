// SwitchCaseExample.java

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 3: ");
        int choice = scanner.nextInt();

        // Switch-case control flow
        switch (choice) {
            case 1:
                System.out.println("You selected option 1.");
                break;
            case 2:
                System.out.println("You selected option 2.");
                break;
            case 3:
                System.out.println("You selected option 3.");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
