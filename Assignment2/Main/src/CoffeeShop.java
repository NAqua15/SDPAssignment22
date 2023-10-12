import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continueShopping = true;

        while(continueShopping) {
            Coffee order = new BasicCoffee();
            boolean continueOrdering = true;

            System.out.println("\nStarting with a basic coffee for $" + order.cost());

            while(continueOrdering) {
                System.out.println("Choose a condiment to add: ");
                System.out.println("1. Milk ($0.50)");
                System.out.println("2. Sugar ($0.10)");
                System.out.println("3. Vanilla ($0.70)");
                System.out.println("4. Done with this coffee order");

                int choice = scanner.nextInt();

                switch(choice) {
                    case 1:
                        order = new MilkDecorator(order);
                        System.out.println("Added Milk!");
                        break;
                    case 2:
                        order = new SugarDecorator(order);
                        System.out.println("Added Sugar!");
                        break;
                    case 3:
                        order = new VanillaDecorator(order);
                        System.out.println("Added Vanilla!");
                        break;
                    case 4:
                        continueOrdering = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                }
            }

            System.out.println("\nYour coffee order: " + order.getDescription());
            System.out.println("Total cost: $" + order.cost());

            System.out.println("\nWould you like to make another coffee order? (yes/no)");
            String anotherOrder = scanner.next();

            if (!anotherOrder.equalsIgnoreCase("yes")) {
                continueShopping = false;
            }
        }

        System.out.println("\nThank you for shopping with us!");
        scanner.close();
    }
}

