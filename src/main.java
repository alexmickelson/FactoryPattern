public class main {
    public static void main(String[] args){
        PizzaStore pizzaStore = new NYPizzaStore();

        pizzaStore.orderPizza("Cheese");
        System.out.println("\n");
        pizzaStore.orderPizza("ClamsAndPepperoni");
        System.out.println("\n");
        pizzaStore.orderPizza("Pepperoni");
    }
}
