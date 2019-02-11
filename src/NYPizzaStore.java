public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("Cheese")){
            pizza = new CheesePizza(ingredientFactory);

        } if (type.equals("ClamsAndPepperoni")){
            pizza = new ClamsAndPepperoniPizza(ingredientFactory);
        }if (type.equals("Pepperoni")){
            pizza = new PepperoniOnly(ingredientFactory);
        }
        return pizza;
    }
}
