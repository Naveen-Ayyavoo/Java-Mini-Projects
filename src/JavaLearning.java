public class JavaLearning {
    public static void main(String[] args) {

        JLvehicle vehicle = new JLvehicle("Honda", 120);
        JLCar car = new JLCar("Suzuki",130,"Petrol");
        JLElectricCar electricCar = new JLElectricCar("Hector",110,75);

        vehicle.displayInfo();
        System.out.println();

        car.displayInfo();
        System.out.println();

        electricCar.displayInfo();
    }
}
