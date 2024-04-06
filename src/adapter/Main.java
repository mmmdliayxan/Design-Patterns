package adapter;

public class Main {
    public static void main(String args[])
    {
        Iphone6 iphone6 = new Iphone6(new Iphone4To6Adapter());
        iphone6.OnCharge();
    }
}
