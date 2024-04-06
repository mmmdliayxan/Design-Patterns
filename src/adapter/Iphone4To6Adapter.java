package adapter;

public class Iphone4To6Adapter implements  Charger{
    Iphone4Charger iphone4Charger;
    Iphone4To6Adapter(){
        iphone4Charger = new Iphone4Charger();
    }
    @Override
    public void charge() {
        iphone4Charger.charge();
    }
}
