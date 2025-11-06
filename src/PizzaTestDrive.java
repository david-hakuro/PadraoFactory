public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Pedi uma pizza de " + pizza.getName() + "\n");

        Pizza pizza2 = nyStore.orderPizza("pepperoni");
        System.out.println("Pedi uma pizza de " + pizza2.getName() + "\n");
    }
}
