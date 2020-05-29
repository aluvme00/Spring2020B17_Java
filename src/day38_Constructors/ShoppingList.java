package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

        Item Item1 = new Item("Toilet Paper", 25, 100);
        Item Item2 = new Item("Milk", 8, 2);
        Item Item3 = new Item("Egg", 10, 40);
        Item Item4 = new Item("Water", 3, 48);
        Item Item5 = new Item("Spam", 12, 6);

        ArrayList<Item> shoppingList = new ArrayList<>();

        shoppingList.addAll(Arrays.asList(Item1,Item2,Item3,Item4,Item5));

        double TotalCost = 0;

        for (Item each: shoppingList){
            TotalCost += each.calcCost();
        }

        System.out.println("Total: " + TotalCost);

    }
}
