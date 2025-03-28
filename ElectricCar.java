public class ElectricCar extends Car{
    private int battery;

    public ElectricCar(){
        super();
        battery = 100;
    }

    public ElectricCar(String b, int s, int f, int br){
        super(b,s,f);
        battery = br;
    }

    public int getBattery(){
        return battery;
    }
    public void setBattery(int b){
        battery = b;
    }

    public void chargeBattery(int amount){
        battery += amount;
    }

    @Override
    public void refuel(int amount){
        System.out.println(getBrand() + " does not use fuel it is charging instead");
        chargeBattery(amount);
    }
}
