public class HardEmployee {

    int numOfEmployees;
    String name;
    double salary;
    String designation;

    HardEmployee(){

            System.out.print("Enter the Name:");
            name = Hard.scanner.nextLine();

            System.out.print("Enter the Salary: ");
            salary = Hard.scanner.nextDouble();
            Hard.scanner.nextLine();

            System.out.print("Enter the Designation: ");
            designation = Hard.scanner.nextLine();

    }

    void applyBonus(){

        if (designation.toLowerCase().contains("manager"))  salary += 7000;
        else if (designation.toLowerCase().contains("developer") || designation.toLowerCase().contains("engineer"))  salary += 5000;
        else if (designation.toLowerCase().contains("associative"))  salary += 3000;
        else if (designation.toLowerCase().contains("executive"))  salary += 2000;
        else salary += 1000;

    }

    void printDetails(){

        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Designation: " + this.designation);
        System.out.println();

    }

}
