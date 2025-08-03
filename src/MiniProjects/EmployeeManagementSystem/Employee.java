package MiniProjects.EmployeeManagementSystem;

// Copy from here
public class Employee {

    String name;
    double salary;
    String designation;

    Employee(){

            System.out.print("Enter the Name:");
            name = Main.scanner.nextLine();

            System.out.print("Enter the Salary: ");
            salary = Main.scanner.nextDouble();
            Main.scanner.nextLine();

            System.out.print("Enter the Designation: ");
            designation = Main.scanner.nextLine();

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
