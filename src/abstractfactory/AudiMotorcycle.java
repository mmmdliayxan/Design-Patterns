package abstractfactory;

public class AudiMotorcycle implements IMotorCycle{
    String type;
    double price;

    public AudiMotorcycle(String type, double price){
        this.type=type;
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
