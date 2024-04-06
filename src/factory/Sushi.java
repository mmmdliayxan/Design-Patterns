package factory;

public class Sushi implements Dish{
    @Override
    public void prepare() {
        System.out.println("Sushi is prepared");
    }

    @Override
    public void serve() {
        System.out.println("Sushi is served");
    }
}
