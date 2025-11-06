import Ingredients.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new MassaGrossa();
    }

    @Override
    public Sauce createSauce() {
        return new MolhoDeTomate();
    }

    @Override
    public Cheese createCheese() {
        return new Mussarela();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new AzeitonasPretas(), new Espinafre(), new Berinjela()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new CalabresaFatiada();
    }

    @Override
    public Clam createClam() {
        return new MariscosCongelados();
    }
}
