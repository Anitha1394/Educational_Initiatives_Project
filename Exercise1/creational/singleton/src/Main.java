package creational.singleton.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Singleton Logger Example ===");

        // Get first log message from user
        System.out.print("Enter first log message: ");
        String msg1 = scanner.nextLine();

        Logger logger1 = Logger.getInstance();
        logger1.log(msg1);

        // Get second log message from user
        System.out.print("Enter second log message: ");
        String msg2 = scanner.nextLine();

        Logger logger2 = Logger.getInstance();
        logger2.log(msg2);

        // Check if both logger instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same. Singleton works!");
        } else {
            System.out.println("Different instances exist. Singleton failed!");
        }

        scanner.close();
    }
}
