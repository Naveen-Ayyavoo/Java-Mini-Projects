package Easy.Basic_Student_Registration;

public class Main {
    public static void main(String[] args) {

       Student[] students = {new Student("Alice",100,"IT"),
                             new Student("Bob",200,"ECE",4),
                             new Student("Cath",300,"AI DS",3,true)};

        for (Student student : students) {
            student.displayInfo();
        }
    }
}
