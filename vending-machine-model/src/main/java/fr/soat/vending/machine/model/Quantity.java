package fr.soat.vending.machine.model;

public class Quantity {

    private final Ingredient ingredient;
    private final long quantity;

    public Quantity(Ingredient ingredient, long quantity) {
        this.ingredient = ingredient;
        this.quantity = quantity;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public long getQuantity() {
        return quantity;
    }
}
