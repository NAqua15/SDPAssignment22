public class SugarDecorator extends CoffeeDecorator {
    Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    public double cost() {
        return 0.10 + coffee.cost();
    }
}