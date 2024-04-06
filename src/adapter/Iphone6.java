package adapter;

public class Iphone6 implements IPhone{
    private final Charger Iphone4To6Adapter;
    public Iphone6(Charger iphone4To6Adapter)
    {
        this.Iphone4To6Adapter = iphone4To6Adapter;
    };

    @Override
    public void OnCharge() {
        Iphone4To6Adapter.charge();
    }
}
