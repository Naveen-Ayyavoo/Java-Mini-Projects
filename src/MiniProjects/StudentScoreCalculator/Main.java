import java.util.Scanner;

public class Easy {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String again;

    do {
        System.out.print("Enter the Name: ");
        String name = scanner.nextLine();

        EasyStudent student = new EasyStudent(name);

        System.out.print("Enter the Marks (10 20 30 ): ");
        String[] stringMarks = scanner.nextLine().split(" ");

        int[] marks = new int[stringMarks.length];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = Integer.parseInt(stringMarks[i]);
        }

        student.getMarks(marks);

        System.out.print("Add another (y/n): ");
        again = scanner.nextLine().trim();

        System.out.println();
    }while (again.equalsIgnoreCase("y"));

        scanner.close();
    }

}
