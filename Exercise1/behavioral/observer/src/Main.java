package behavioral.observer.src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Weather Notification System ===");

        boolean running = true;
        while (running) {
            System.out.println("\n1. Add Observer");
            System.out.println("2. Remove Observer");
            System.out.println("3. Update Temperature");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter observer name: ");
                        String name = sc.nextLine();
                        station.registerObserver(new UserDisplay(name));
                    }
                    case 2 -> {
                        System.out.print("Enter observer name to remove: ");
                        String name = sc.nextLine();
                        station.removeObserver(new UserDisplay(name));
                    }
                    case 3 -> {
                        System.out.print("Enter new temperature: ");
                        int temp = sc.nextInt();
                        station.setTemperature(temp);
                    }
                    case 4 -> running = false;
                    default -> System.out.println("Invalid option, try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numbers only.");
                sc.nextLine(); // clear buffer
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
        System.out.println("Program exited.");
    }
}
