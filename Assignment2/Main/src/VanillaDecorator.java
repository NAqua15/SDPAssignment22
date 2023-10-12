public class VanillaDecorator extends CoffeeDecorator {
    Coffee coffee;

    public VanillaDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Vanilla";
    }

    public double cost() {
        return 0.70 + coffee.cost();
    }
}