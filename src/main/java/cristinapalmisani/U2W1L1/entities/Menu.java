package cristinapalmisani.U2W1L1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Menu {
    private List<Pizzas> pizzasList;
    private List<Drinks> drinksList;
    private List<Toppings> toppingList;

    public void printMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZAS");
        this.pizzasList.forEach(System.out::println);
        System.out.println();

        System.out.println("TOPPINGS");
        this.toppingList.forEach(System.out::println);
        System.out.println();

        System.out.println("DRINKS");
        this.drinksList.forEach(System.out::println);
        System.out.println();

    }

    public double getPrice() {
        double totalPrice = 0;
        for (Pizzas pizza : pizzasList) {
            totalPrice += pizza.getPrice();
        }
        for (Drinks drink : drinksList) {
            totalPrice += drink.getPrice();
        }
        return totalPrice;
    }

}
