package cristinapalmisani.U2W1L1.entities;

import lombok.*;


@Getter
@Setter

public class Drinks extends MenuItem{

    private double litre;

    public Drinks(String name, int calories, double price, double litre) {
        super(name, calories, price);
        this.litre = litre;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "name='" + getName() + '\'' +
                ", calories=" + getCalories() +
                ", price=" + getPrice() +
                ", litre=" + getLitre() + "l" +
                '}';
    }

}
