package week7.FruitShop;

import model.Order;

import java.util.ArrayList;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        ArrayList<Fruit> lf = new ArrayList<>();
        Hashtable<String, ArrayList<Order>> ht = new Hashtable<>();

        while (true) {
            int choice = ManagerFruit.menu();
            switch (choice) {
                case 1:
                    ManagerFruit.createFruit(lf);
                    break;
                case 2:
                    ManagerFruit.viewOrder(ht);
                    break;
                case 3:
                    ManagerFruit.shopping(lf, ht);
                    break;
                case 4:
                    return;
            }
        }
    }

}