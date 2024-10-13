// OperatorsDemo.java

public class OperatorsDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // Arithmetic operators
        int sum = x + y;
        int difference = y - x;
        int product = x * y;
        int quotient = y / x;
        int remainder = y % x;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Relational operators
        boolean isEqual = x == y;
        boolean isGreater = x > y;
        boolean isLessOrEqual = x <= y;

        System.out.println("Is Equal? " + isEqual);
        System.out.println("Is Greater? " + isGreater);
        System.out.println("Is Less or Equal? " + isLessOrEqual);

        // Logical operators
        boolean andResult = (x > 5) && (y < 30);
        boolean orResult = (x > 15) || (y < 30);
        boolean notResult = !(x > y);

        System.out.println("Logical AND: " + andResult);
        System.out.println("Logical OR: " + orResult);
        System.out.println("Logical NOT: " + notResult);
    }
}
