public class JLCar extends JLvehicle {

    String fuelType;

    JLCar(String brand, double speed, String fuelType){
        super(brand,speed);
        this.fuelType = fuelType;

    }
    void displayInfo(){
        System.out.println("The Vehicle is from " + this.brand + " with a Max Speed of " + this.speed);
        System.out.println("The Car uses " + this.fuelType + " as Fuel.");
    }
}
