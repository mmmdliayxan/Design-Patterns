package factory;

public class Pizza implements Dish{
    @Override
    public void prepare() {
        System.out.println("Pizza is prepared");
    }

    @Override
    public void serve() {
        System.out.println("Pizza is served");
    }
}
