package factory;

public class PizzaFactory implements DishFactory{
    @Override
    public Dish createDish() {
        return new Pizza();
    }
}
