// MultiDimensionalArray.java

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare and initialize a 2D array
        int[][] matrix = new int[3][3];

        // Input values into the 2D array
        System.out.println("Enter 9 integers for a 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the 2D array (matrix)
        System.out.println("The 3x3 matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // Move to the next line
        }
    }
}
