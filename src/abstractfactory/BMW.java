package abstractfactory;

public class BMW implements ICar{
    String color;
    double price;

    public BMW(String color, double price){
        this.color=color;
        this.price=price;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
