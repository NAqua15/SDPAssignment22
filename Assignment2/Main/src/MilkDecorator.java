public class MilkDecorator extends CoffeeDecorator {
    Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    public double cost() {
        return 0.50 + coffee.cost();
    }
}