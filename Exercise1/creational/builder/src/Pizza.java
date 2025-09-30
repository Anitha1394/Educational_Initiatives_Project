package creational.builder.src;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    private final String size;        // small, medium, large
    private final String crust;       // thin, thick
    private final List<String> toppings;

    // Private constructor called by Builder
   private Pizza(PizzaBuilder builder) {
    this.size = builder.size;
    this.crust = builder.crust;
    // defensive copy + handle null
    this.toppings = builder.toppings == null
           ? Collections.emptyList()
           : new ArrayList<>(builder.toppings);
}

    @Override
    public String toString() {
        return "Pizza [Size=" + size + ", Crust=" + crust + ", Toppings=" + toppings + "]";
    }

    // Builder inner class
    public static class PizzaBuilder {
        private String size;
        private String crust;
        private List<String> toppings;

        public PizzaBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public PizzaBuilder setCrust(String crust) {
            this.crust = crust;
            return this;
        }

        public PizzaBuilder setToppings(List<String> toppings) {
            this.toppings = toppings;
            return this;
        }
        public Pizza build() {
    // Check if size is provided
    if (size == null || size.isBlank()) {
        throw new IllegalStateException("Size is required");
    }

    // Validate allowed size values
    List<String> allowedSizes = List.of("small", "medium", "large");
    if (!allowedSizes.contains(size.toLowerCase())) {
        throw new IllegalStateException("Invalid size! Allowed values: small, medium, large");
    }

    // Optional: check crust
    if (crust == null || crust.isBlank()) {
        throw new IllegalStateException("Crust is required");
    }

    // Ensure toppings list is not null
    if (toppings == null) {
        toppings = Collections.emptyList();
    }

    // Build and return the final Pizza object
    return new Pizza(this);
}



    }
}
