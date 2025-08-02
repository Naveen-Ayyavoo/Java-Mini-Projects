public class JLElectricCar extends JLvehicle{

    int batteryCapacity;

    JLElectricCar(String brand, double speed, int batteryCapacity){
        super(brand,speed);
        this.batteryCapacity = batteryCapacity;
    }
    void displayInfo(){
        System.out.println("The Vehicle is from " + this.brand + " with a Max Speed of " + this.speed);
        System.out.println("The Car haves " + this.batteryCapacity + "Ah as battery capacity.");
    }
}
