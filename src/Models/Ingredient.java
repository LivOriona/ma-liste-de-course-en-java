package Models;

public class Ingredient {
    String name;
    String unit;
    Double quantity; // équivalent à float
    Double cost;

    public Ingredient(String name, String unit, Double quantity, Double cost) {
        this.name = name;
        this.unit = unit;
        this.quantity = quantity;
        this.cost = cost;
    }
}
