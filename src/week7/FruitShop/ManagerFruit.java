package week7.FruitShop;

import model.Order;

import java.util.ArrayList;
import java.util.Hashtable;

public class ManagerFruit {

    public static int menu() {
        System.out.println("1. Create Fruit");
        System.out.println("2. View orders");
        System.out.println("3. Shopping (for buyer)");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        return  Validation.checkInputIntLimit(1, 4);
    }

    public static void createFruit(ArrayList<Fruit> lf) {
        while (true) {
            System.out.print("Enter fruit id: ");
            String fruitId = Validation.checkInputString();
            
            // Check if the fruit ID already exists
            Fruit existingFruit = findFruitById(lf, fruitId);
            if (existingFruit != null) {
                System.out.println("Id exists. Do you want to update this fruit? (Y/N): ");
                if (Validation.checkInputYN()) {
                    System.out.print("Enter new price: ");
                    double newPrice = Validation.checkInputDouble();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = Validation.checkInputInt();
                    System.out.print("Enter new origin: ");
                    String newOrigin = Validation.checkInputString();

                    existingFruit.setPrice(newPrice);
                    existingFruit.setQuantity(existingFruit.getQuantity() + newQuantity);
                    existingFruit.setOrigin(newOrigin);
                    System.out.println("Fruit updated successfully!");
                }
            } else {
                System.out.print("Enter fruit name: ");
                String fruitName = Validation.checkInputString();
                System.out.print("Enter price: ");
                double price = Validation.checkInputDouble();
                System.out.print("Enter quantity: ");
                int quantity = Validation.checkInputInt();
                System.out.print("Enter origin: ");
                String origin = Validation.checkInputString();
                lf.add(new Fruit(fruitId, fruitName, price, quantity, origin));
            }

            if (!Validation.checkInputYN()) {
                break;
            }
        }
    }

    public static void viewOrder(Hashtable<String, ArrayList<Order>> ht) {
        for (String name : ht.keySet()) {
            System.out.println("Customer: " + name);
            ArrayList<Order> lo = ht.get(name);
            displayListOrder(lo);
        }
    }

    public static void shopping(ArrayList<Fruit> lf, Hashtable<String, ArrayList<Order>> ht) {
        if (lf.isEmpty()) {
            System.err.println("No items available.");
            return;
        }

        ArrayList<Order> lo = new ArrayList<>();
        while (true) {
            displayListFruit(lf);
            if (lf.stream().allMatch(f -> f.getQuantity() == 0)) {
                System.err.println("No fruits available for purchase.");
                break;
            }
            
            System.out.print("Enter item number: ");
            int item = Validation.checkInputIntLimit(1, lf.size());
            Fruit fruit = getFruitByItem(lf, item);

            if (fruit == null || fruit.getQuantity() == 0) {
                System.err.println("Selected fruit is out of stock. Please choose another.");
                continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = Validation.checkInputIntLimit(1, fruit.getQuantity());
            fruit.setQuantity(fruit.getQuantity() - quantity);

            if (!Validation.checkItemExist(lo, fruit.getFruitId())) {
                updateOrder(lo, fruit.getFruitId(), quantity);
            } else {
                lo.add(new Order(fruit.getFruitId(), fruit.getFruitName(), quantity, fruit.getPrice()));
            }

            if (!Validation.checkInputYN()) {
                break;
            }
        }

        displayListOrder(lo);
        System.out.print("Enter your name: ");
        String name = Validation.checkInputString();
        ht.put(name, lo);
        System.out.println("Purchase successful!");
    }

    private static Fruit findFruitById(ArrayList<Fruit> lf, String id) {
        for (Fruit fruit : lf) {
            if (fruit.getFruitId().equalsIgnoreCase(id)) {
                return fruit;
            }
        }
        return null;
    }

    private static void displayListFruit(ArrayList<Fruit> lf) {
        System.out.printf("%-10s%-20s%-20s%-15s\n", "Item", "Fruit Name", "Origin", "Price");
        int countItem = 1;
        for (Fruit fruit : lf) {
            if (fruit.getQuantity() > 0) {
                System.out.printf("%-10d%-20s%-20s%-15.0f$\n", countItem++,
                        fruit.getFruitName(), fruit.getOrigin(), fruit.getPrice());
            }
        }
    }

    private static Fruit getFruitByItem(ArrayList<Fruit> lf, int item) {
        int countItem = 1;
        for (Fruit fruit : lf) {
            if (fruit.getQuantity() > 0) {
                if (countItem == item) {
                    return fruit;
                }
                countItem++;
            }
        }
        return null;
    }

    private static void displayListOrder(ArrayList<Order> lo) {
        double total = 0;
        System.out.printf("%-20s%-10s%-10s%-10s\n", "Product", "Quantity", "Price", "Amount");
        for (Order order : lo) {
            double amount = order.getQuantity() * order.getPrice();
            total += amount;
            System.out.printf("%-20s%-10d%-10.2f%-10.2f\n", order.getFruitName(),
                    order.getQuantity(), order.getPrice(), amount);
        }
        System.out.printf("Total: %.2f$\n", total);
    }

    private static void updateOrder(ArrayList<Order> lo, String id, int quantity) {
        for (Order order : lo) {
            if (order.getFruitId().equalsIgnoreCase(id)) {
                order.setQuantity(order.getQuantity() + quantity);
                return;
            }
        }
    }
}
