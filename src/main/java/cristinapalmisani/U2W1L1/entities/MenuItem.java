package cristinapalmisani.U2W1L1.entities;

import lombok.Getter;

@Getter
public abstract class MenuItem {
    private String name;
    private int calories;
    private double price;

    public MenuItem(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }
}