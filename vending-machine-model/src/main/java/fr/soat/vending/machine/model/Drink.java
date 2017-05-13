package fr.soat.vending.machine.model;

import java.util.List;

/**
 * Created by simuland on 02/05/2017.
 */
public class Drink {

    private final String name;

    private final List<Quantity> quantities;

    public Drink(String name, List<Quantity> quantities) {
        this.name = name;
        this.quantities = quantities;
    }

    public List<Quantity> getQuantities() {
        return quantities;
    }

    public String getName() {
        return name;
    }
}
