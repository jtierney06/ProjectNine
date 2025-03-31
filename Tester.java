import java.util.ArrayList;

public class Tester {
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle1 = new Vehicle("Vehicle", 50);
        Vehicle vehicle2 = new Car("Car", 70 , 60);
        Vehicle vehicle3 = new ElectricCar("Electirc Car", 0 , 0, 90);
        Vehicle vehicle4 = new Vehicle("Vehicle", 20);
        Vehicle vehicle5 = new Vehicle("Vehicle", 30);
        Vehicle vehicle6 = new Vehicle("Vehicle", 40);
        Car car1 = new Car("Car 2", 80, 40);
        Car car2 = car1;

        ElectricCar electricCar1 = new ElectricCar("Electric Car 2", 40, 90, 100);
        ElectricCar electricCar2 = new ElectricCar("Electric Car 3", 70, 100, 70);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        vehicles.add(vehicle3);
        vehicles.add(vehicle4);
        vehicles.add(vehicle5);
        vehicles.add(vehicle6);
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(electricCar1);
        vehicles.add(electricCar2);
       


        for(Vehicle v : vehicles){
            System.out.println(v);
        }

        System.out.println("Aliasing: ");
        car1.setFuel(10);
        System.out.println(car1);
        System.out.println(car2);

        vehicle1.accelerate(10);
        vehicle2.accelerate(20);
        vehicle3.accelerate(30);
        car1.accelerate(15);
        vehicle1.brake();
        car1.brake();
        electricCar1.brake();


        for(Vehicle v : vehicles){
            System.out.println(v);
        }


    }
}
