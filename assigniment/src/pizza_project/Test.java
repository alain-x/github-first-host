package pizza;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generate a random pizza
        Pizza randomPizza = new Pizza();
        System.out.println("Randomly Generated Pizza: " + randomPizza);

        System.out.print("Enter the number of pizzas to order: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            try {
                System.out.println("Ordering Pizza " + (i + 1));
                System.out.print("Enter number of slices: ");
                int slices = scanner.nextInt();

                System.out.print("Choose a meat (CHICKEN, BEEF, PEPPERONI): ");
                MeatChoice meatChoice = MeatChoice.valueOf(scanner.next().toUpperCase());

                System.out.print("Choose a vegetable (ONIONS, PEPPERS, OLIVES, MUSHROOMS, SPINACH): ");
                VegChoice vegChoice = VegChoice.valueOf(scanner.next().toUpperCase());

                Pizza customPizza = new Pizza(slices, meatChoice, vegChoice);
                System.out.println("Custom Pizza: " + customPizza);

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice! Try again.");
            }
        }

        scanner.close();
    }
}
