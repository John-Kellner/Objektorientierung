package coffe;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.2; // Sugar adds 0.2
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}
