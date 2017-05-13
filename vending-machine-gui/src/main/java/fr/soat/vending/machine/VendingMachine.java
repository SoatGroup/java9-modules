package fr.soat.vending.machine;

import fr.soat.vending.machine.services.DrinksService;

import java.util.ServiceLoader;

public class VendingMachine {

    public static void main(String[] arg) throws Exception {

        ServiceLoader<DrinksService> drinkServiceProviders = ServiceLoader.load(DrinksService.class);

        drinkServiceProviders.stream().map(provider -> provider.get())
                .forEach(service -> {
                            System.out.println(service.getClass().getSimpleName() + " can offer you:");
                            service.getAllDrinks().stream()
                                    .map(d -> " - " + d.getName())
                                    .forEach(System.out::println);
                        }
                );
    }
}
