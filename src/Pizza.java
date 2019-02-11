public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Clams clam;
    Pepperoni pepperoni;

    abstract void prepare();

    void bake(){
        System.out.println("Bake for 500 min at 300 degrees");
    }

    void cut(){
        System.out.println("Cutting diagonal slices");

    }

    void box(){
        System.out.println("Placing pizza in NY box");

    }

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }

    public String toString(){
        return "This is toString";
    }
}
