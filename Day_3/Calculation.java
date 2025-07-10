import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "y";

        while (again.equalsIgnoreCase("y")) {
            // Ask user for two numbers
            System.out.print("Enter first number: ");
            double x = input.nextDouble();

            System.out.print("Enter second number: ");
            double y = input.nextDouble();

            // Ask user for the operation
            System.out.print("Choose operation (+, -, *, /): ");
            String op = input.next();  // Use next() instead of nextLine() here

            // Perform the operation using if-else
            if (op.equals("+")) {
                System.out.println("Result: " + (x + y));
            } else if (op.equals("-")) {
                System.out.println("Result: " + (x - y));
            } else if (op.equals("*")) {
                System.out.println("Result: " + (x * y));
            } else if (op.equals("/")) {
                if (y == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (x / y));
                }
            } else {
                System.out.println("Invalid operation.");
            }

            // Ask user if they want to continue
            System.out.print("Do you want to calculate again? (y/n): ");
            again = input.next();  // Take next input
        }

        System.out.println("Thank you for using the calculator.");
    }
}
