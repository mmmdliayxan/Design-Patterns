package abstractfactory;

public class BMWFactory implements IAbstractFactory{
    @Override
    public ICar createCar(String color, double price) {
        return new BMW(color,price)
    }

    @Override
    public IMotorCycle createMotorcycle(String type, double price) {
        return new BMWMotorcycle(type,price);
    }
}
