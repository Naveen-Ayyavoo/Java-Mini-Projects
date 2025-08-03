import java.util.Scanner;

public class Medium {
    static Scanner scanner = new Scanner(System.in);
    static MediumMatrix matrix = null;
    public static void main(String[] args) {

        int choice;
        String[] options = {"1. Enter new matrix","2. Display sum","3. Transpose","4. Check symmetric","5. Exit"};

        do {

            System.out.println("-------------------");

            for (String option : options) {
                System.out.println(option);
            }

            System.out.println("-------------------");
            System.out.print("Enter Choice: ");
            choice = scanner.nextInt();
            System.out.println();

            if (choice >= 1 && choice <= 6){
                if (choice == 1) {
                    System.out.print("Enter the rows: ");
                    int rows = scanner.nextInt();

                    System.out.print("Enter the cols: ");
                    int cols = scanner.nextInt();


                    matrix = new MediumMatrix(rows, cols);
                }
                else if (choice == 2) {
                    if (matrix != null) matrix.sum();
                    else System.out.println("You have to Initialize the Matrix First");
                }
                else if (choice == 3) {
                    if (matrix != null) matrix.transpose();
                    else System.out.println("You have to Initialize the Matrix First");
                }
                else if (choice == 4){
                    if (matrix != null) matrix.symmetric();
                    else System.out.println("You have to Initialize the Matrix First");
                }
                else {
                    System.out.println("Exiting....");
                    System.out.println("Thank You");
                    break;
                }
            }else {
                System.out.println("Error: Invalid choice");
                System.out.println("Try Again");
            }
        }while (true);
    }
}
