import java.util.Scanner;

public class Hard {
    static HardEmployee[] employees = null;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {



        String[] choices = {"1.Add Employee","2.View All Employees", "3.Apply Bonus", "4.Exit"};

        int choice;

        do {

            System.out.println("-----------------");

            for (String i: choices){
                System.out.println(i);
            }

            System.out.println("-----------------");

            System.out.print("Enter a Choice: ");
            choice = scanner.nextInt();
            System.out.println();

            if ((choice >= 1) && (choice <= 4)) {
                if (choice == 1) {
                    System.out.print("Enter the Number of Employees: ");
                    int num = scanner.nextInt();
                    scanner.nextLine();

                    employees= new HardEmployee[num];

                    for (int i = 0; i < num; i++) {
                        System.out.printf("Enter Employee %d\n", i + 1);
                        employees[i] = new HardEmployee();
                        System.out.println();
                    }
                    System.out.println("Added Successfully!");
                }
                else if (choice == 2) {
                    if (employees == null) System.out.println("""
                            There is no Employees Data.
                            Please Enter choice 1.
                            """);
                    else {
                        int total = 0;
                        for (HardEmployee employee :employees) {
                            employee.printDetails();
                            total++;
                        }
                        System.out.println("Total Employees: " + total);
                    }
                }
                else if (choice == 3) {
                    if (employees == null) System.out.println("""
                            There is no Employees Data.
                            Please Enter choice 1.
                            """);

                    else for (HardEmployee employee :Hard.employees ) {
                        employee.applyBonus();
                        System.out.println("Bonus Applied Successfully!");
                    }

                }
                else {
                    System.out.println("Exiting...");
                    System.out.println("Good Bye!");
                    break;
                }
            }
            else {
                System.out.println("Invalid Choice");
                System.out.println("Try Again");
            }
        }while (true);



        scanner.close();
    }
}
