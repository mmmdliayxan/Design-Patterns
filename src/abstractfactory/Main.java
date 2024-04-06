package abstractfactory;

public class Main {
    public static void main(String[] args) {
        IAbstractFactory audiFactory = new AudiFactory();
        IAbstractFactory bmwFactory = new BMWFactory();


        ICar audiCar = audiFactory.createCar("Black", 500000);
        ICar bmwCar  = bmwFactory.createCar("White", 420000);

        IMotorCycle audiMotorCycle = audiFactory.createMotorcycle("Racing Motorcycle", 125000);
        IMotorCycle bmwMotorCycle = bmwFactory.createMotorcycle("Street Motorcycle", 24000);
    }
}
