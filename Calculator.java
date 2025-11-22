import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Choose operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter choice (1-4): ");
        int choice = sc.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = a + b;
                System.out.println("Result = " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Result = " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result = " + result);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    result = a / b;
                    System.out.println("Result = " + result);
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}