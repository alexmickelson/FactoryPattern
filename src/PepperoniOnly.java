public class PepperoniOnly extends  Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniOnly(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
        name = "Only Pepperonis";
    }

    @Override
    void prepare() {
        System.out.println("Prepparing " + name);
        pepperoni = ingredientFactory.createPepperoni();

    }
}
