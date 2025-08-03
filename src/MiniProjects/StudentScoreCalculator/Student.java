package MiniProjects.StudentScoreCalculator;

// Copy from here
public class Student {

    String name;
    int[] marks;

    Student(String name){
        this.name = name;
    }

    void getMarks(int... marks){
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        System.out.println("Total: " + total);

        if (total > 450) System.out.println("Status: Pass" );
        else System.out.println("Status: Fail");

    }
}