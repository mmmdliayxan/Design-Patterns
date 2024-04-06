package abstractfactory;

public interface IAbstractFactory {
    ICar createCar(String color,double price);
    IMotorCycle createMotorcycle(String type,double price);
}
