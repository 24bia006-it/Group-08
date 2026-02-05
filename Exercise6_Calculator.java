
/**
 * Write a description of class Exercise6_Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    import java.util.Scanner;

public class Exercise6_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("=== Simple Calculator ===\n");

        //Get first number
            
            System.out.print("\nEnter first number: ");
            double num1 = scanner.nextDouble();

            
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            //get second number

            
            System.out.print("Enter operation (+, -, *, /, %, ^): ");
            char operation = scanner.next().charAt(0);
            //Get operation

            double result;
            boolean validOperation = true;
            //Perform calculation using switch

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, result);
                    break;

                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, result);
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;

                case '%':
                    result = num1 % num2;
                    System.out.printf("%.2f %% %.2f = %.2f%n", num1, num2, result);
                    break;

                case '^':
                    result = Math.pow(num1, num2);
                    System.out.printf("%.2f ^ %.2f = %.2f%n", num1, num2, result);
                    break;

                default:
                    System.out.println("Error: Invalid operation!");
                    validOperation = false;
            }

            
        scanner.close();
    }
}

