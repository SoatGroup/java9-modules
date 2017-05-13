package fr.soat.vending.machine.services;

import java.util.List;

import fr.soat.vending.machine.model.Drink;
import fr.soat.vending.machine.model.Ingredient;

public interface DrinksService {

    List<Drink> getAllDrinks();
    List<Drink> findDrinksWith(List<Ingredient> ingredients);

    //ResultSet testPublicRequires();
}
