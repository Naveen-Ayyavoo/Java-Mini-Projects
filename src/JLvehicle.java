public class JLvehicle {

    String brand;
    double speed;

    JLvehicle(String brand, double speed){
        this.brand = brand;
        this.speed = speed;

    }
        void displayInfo(){
            System.out.println("The Vehicle is from " + this.brand + " with a Max Speed of " + this.speed + " KmPh");
        }
}
