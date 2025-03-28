public class Vehicle{
    private String brand;
    private int speed;

    public Vehicle(){
        brand = "Unknown";
        speed = 0;
    }

    public Vehicle(String b, int s){
        brand = b;
        speed = s;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String b){
        brand = b;
    }

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int s){
        speed = s;
    }

    public void accelerate(int amount){
        speed += amount;
        System.out.println(brand + " accelerates to " + speed + " mph");
    }

    public void brake(){
        speed = 0;
        System.out.println(brand + " stops");
    }

    public String toString(){
        return "Brand: " + brand + " Speed: " + speed + " mph";
    }
}