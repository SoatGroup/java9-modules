module soat.vending.machine.gui {
    requires java.desktop;
    requires soat.vending.machine.model;
    requires soat.coffee.maker;

    //requires tea.maker.legacy;

    uses fr.soat.vending.machine.services.DrinksService;
}