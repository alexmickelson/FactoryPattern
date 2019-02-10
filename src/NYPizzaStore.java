public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("Cheese")){
            pizza = new CheesePizza(ingredientFactory);

        }
        return pizza;
    }
}
