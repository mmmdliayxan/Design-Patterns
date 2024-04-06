package abstractfactory;

public class AudiFactory implements IAbstractFactory{
    @Override
    public ICar createCar(String color, double price) {
        return new Audi(color,price);
    }

    @Override
    public IMotorCycle createMotorcycle(String type, double price) {
        return new AudiMotorcycle(type,price);
    }
}
