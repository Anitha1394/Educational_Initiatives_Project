package behavioral.interpreter.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Interpreter Pattern: Arithmetic Interpreter ===");
        System.out.println("Enter expression (e.g., 5+3, 10-2, 4*6, 20/5)");
        System.out.println("Supported operators: +, -, *, /");
        System.out.println("Type 'exit' to quit.");

        while(true) {
            System.out.print("\nEnter expression: ");
            String input = sc.nextLine();

            if(input.equalsIgnoreCase("exit")) break;

            try {
                // Split numbers and operator
                String operator = input.replaceAll("[0-9]", "").trim();
                if(operator.length() != 1) {
                    System.out.println("Invalid format! Example: 5+3");
                    continue;
                }

                String[] numbers = input.split("[+\\-*/]");
                if(numbers.length != 2) {
                    System.out.println("Invalid format! Example: 5+3");
                    continue;
                }

                int num1 = Integer.parseInt(numbers[0].trim());
                int num2 = Integer.parseInt(numbers[1].trim());

                Expression exp1 = new NumberExpression(num1);
                Expression exp2 = new NumberExpression(num2);
                Expression result;

                switch(operator) {
                    case "+":
                        result = new AddExpression(exp1, exp2);
                        break;
                    case "-":
                        result = new SubtractExpression(exp1, exp2);
                        break;
                    case "*":
                        result = new MultiplyExpression(exp1, exp2);
                        break;
                    case "/":
                        result = new DivideExpression(exp1, exp2);
                        break;
                    default:
                        System.out.println("Unsupported operator! Only +, -, *, / are supported.");
                        continue;
                }

                System.out.println("Result: " + result.interpret());

            } catch(NumberFormatException e) {
                System.out.println("Invalid numbers! Please enter integers.");
            } catch(ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
        System.out.println("Exiting Arithmetic Interpreter.");
    }
}
