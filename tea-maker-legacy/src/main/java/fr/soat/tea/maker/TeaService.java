package fr.soat.tea.maker;

import fr.soat.vending.machine.model.Drink;
import fr.soat.vending.machine.model.Ingredient;
import fr.soat.vending.machine.services.DrinksService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TeaService implements DrinksService {

    private static final List<Drink> DRINKS;
    static {
        List<Drink> drinks = new ArrayList<>();
        drinks.add(new Drink("Earl grey Tea", null));
        drinks.add(new Drink("Mint Tea", null));
        DRINKS = Collections.unmodifiableList(drinks);
    }

    @Override
    public List<Drink> getAllDrinks() {
        return DRINKS;
    }

    @Override
    public List<Drink> findDrinksWith(List<Ingredient> ingredients) {
        List<Drink> drinks = DRINKS.stream()
                .filter(d -> hasIngredient(d, ingredients))
                .collect(Collectors.toList());
        return drinks;
    }

    private static boolean hasIngredient(Drink drink, List<Ingredient> ingredients) {
        return true;
    }
}