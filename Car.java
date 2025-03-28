public class Car extends Vehicle {
    private int fuel;

    public Car(){
        super();
        fuel = 100;
    }

    public Car(String b, int s, int f){
        super(b,s);
        fuel = f;
    }

    public int getFuel(){
        return fuel;
    }
    public void setFuel(int f){
        fuel = f;
    }

    @Override
    public void accelerate(int amount){
        if(fuel > 0){
            super.accelerate(amount);
            fuel -= 5;
        }else{
            System.out.println(getBrand() + " has no fuel left");
        }
    }

    public void refuel(int amount){
        fuel += amount;
        System.out.println(getBrand() + " refueled");
    }

    public void checkFuel(){
        System.out.println(getBrand() + " fuel level: " + fuel);
    }

    @Override
    public String toString(){
        return super.toString() + " fuel level: " + fuel;
    }
}
