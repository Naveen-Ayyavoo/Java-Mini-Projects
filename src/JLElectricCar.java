public class JLElectricCar extends JLvehicle{

    int batteryCapacity;

    JLElectricCar(String brand, double speed, int batteryCapacity){
        super(brand,speed);
        this.batteryCapacity = batteryCapacity;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("The Car haves " + this.batteryCapacity + "Ah as battery capacity.");
    }
}
