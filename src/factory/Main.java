package factory;

public class Main {
    public static void main(String[] args) {
        DishFactory dishFactory = new PizzaFactory();
        Dish pizza = dishFactory.createDish();
        pizza.prepare();
        pizza.serve();

        DishFactory dishFactory1 = new SushiFactory();
        Dish sushi = dishFactory1.createDish();
        sushi.prepare();
        sushi.serve();
    }
}
