package abstractfactory;

public class BMWMotorcycle implements IMotorCycle{
    String type;
    double price;

    public BMWMotorcycle(String color, double price){
        this.type=color;
        this.price=price;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
