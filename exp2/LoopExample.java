// LoopExample.java

public class LoopExample {
    public static void main(String[] args) {
        // For loop example
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // While loop example
        System.out.println("While loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        // Do-while loop example
        System.out.println("Do-while loop:");
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}
