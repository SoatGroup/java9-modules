module soat.coffee.maker {
    requires soat.vending.machine.model;
    provides fr.soat.vending.machine.services.DrinksService
            with fr.soat.coffee.maker.CoffeeService;
}