public class JLCar extends JLvehicle {

    String fuelType;

    JLCar(String brand, double speed, String fuelType){
        super(brand,speed);
        this.fuelType = fuelType;

    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("The Car uses " + this.fuelType + " as Fuel.");
    }
}
