package creational.builder.src;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Pizza Builder ===");

        System.out.print("Enter pizza size (small/medium/large): ");
        String size = sc.nextLine();

        System.out.print("Enter crust type (thin/thick): ");
        String crust = sc.nextLine();

        List<String> toppings = new ArrayList<>();
        boolean addingToppings = true;
        while (addingToppings) {
            System.out.print("Add a topping (or type 'done' to finish): ");
            String topping = sc.nextLine();
            if (topping.equalsIgnoreCase("done")) {
                addingToppings = false;
            } else {
                toppings.add(topping);
            }
        }

        // Build pizza using Builder
        Pizza pizza = new Pizza.PizzaBuilder()
                .setSize(size)
                .setCrust(crust)
                .setToppings(toppings)
                .build();

        System.out.println("\nYour pizza is ready!");
        System.out.println(pizza);

        sc.close();
    }
}
