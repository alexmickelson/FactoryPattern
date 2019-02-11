public class ClamsAndPepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamsAndPepperoniPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
        name = "Clam and Pepperoni Pizza";
    }

    @Override
    void prepare() {
        System.out.println("Preparing" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
        clam = ingredientFactory.createClams();
        pepperoni = ingredientFactory.createPepperoni();

    }
}
