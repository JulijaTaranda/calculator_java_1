
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.print("Enter first number (any rational number): ");
            double num1 = scan.nextDouble();

            System.out.print("Enter second number (any rational number) : ");
            double num2 = scan.nextDouble();

            System.out.print("Choose operation: +, -, *, /, e - exit : ");
            String operation = scan.next();

            double result;

            switch (operation) {
                case "+":
                    result = (num1 + num2);
                    System.out.printf("Result: %.2f%n",result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.printf("Result: %.2f%n",result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.printf("Result: %.2f%n",result);
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.printf("Result: %.2f%n",result);
                    } else {
                        System.out.println("Error, cannot divide by zero");
                        break;
                    }
                    break;
                case "e":
                    System.out.println("The end!");
                    return;
                default:
                    System.out.println("Error, try another operation...");
                    break;
            }

        }

    }
}