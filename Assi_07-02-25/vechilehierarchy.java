
public class vechilehierarchy {
    public static void main(String[] args) {
        Car car = new Car(120.0f,"Petrol");
        car.displayInfo("Verna",4);
        Truck truck = new Truck(100f, "Diesel");
        truck.displayInfo("Volvo",2);
        MotorCycle Bike = new MotorCycle(160f, "Petrol");
        Bike.displayInfo("GT 650",2);
    }
}
class Vechile{
    float MaxSpeed;
    String fuelType;

    public void displayInfo(){
        System.out.println("Info of Vechile");
    }
}
class Car extends Vechile{
    String name;
    int seatCapacity;
    Car(float maxSpeed, String fuelType){
        this.MaxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    public void displayInfo(String name, int seatCapacity){
        System.out.println("Car Name:"+name + " Seat Capacity:"+seatCapacity + " Max Speed:"+ MaxSpeed + " Fuel Type:"+ fuelType);
    }

}
class Truck extends Vechile{
    String name;
    int seatCapacity;
    Truck(float maxSpeed, String fuelType){
        this.MaxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    public void displayInfo(String name, int seatCapacity){
        System.out.println("Truck Name:"+name + " Seat Capacity:"+seatCapacity + " Max Speed:"+ MaxSpeed + " Fuel Type:"+ fuelType);
    }

}
class MotorCycle extends Vechile{
    String name;
    int seatCapacity;
    MotorCycle(float maxSpeed, String fuelType){
        this.MaxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    public void displayInfo(String name, int seatCapacity){
        System.out.println("Bike Name:"+name + " Seat Capacity:"+seatCapacity + " Max Speed:"+ MaxSpeed + " Fuel Type:"+ fuelType);
    }

}

